package creational.builder.computer;
// 1. Lớp có đối tượng cần xây dựng với nhiều thành phần
public class Computer {
    // 3. Các đối tượng thành phần cần xây dựng từ đối tượng builder. Không sử dụng bổ từ truy cập public
    String CPU, RAM, storage, screen;
    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
    // 2. Lớp Builder có nhiệm vụ xây dựng các thành phần cho đối tượng cần khởi tạo (Computer)
    public static class Builder{
        private String CPU, RAM, storage, screen;

        // 5.xzhm Phương thức xây dựng môột thành phần của Computer
        public Builder addCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        // 4. Phương thức (Bắt buộc phải có của lới Builder) dùng để trả về đối tượng cần được xây dựng
        public Computer build(){
            return new Computer(this);
        }
    }
}
