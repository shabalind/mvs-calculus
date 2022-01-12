  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s3(std::vector<s0> v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s1> p0;
    s0 p1;
    s4(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s1>> p0;
    std::vector<std::vector<s1>> p1;
    s6(std::vector<std::vector<s1>> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s3 p0;
    s6 p1;
    s7(s3 v0, s6 v1): p0(v0), p1(v1) { }
  };
  double f7(const double &v0) {
    const std::vector<double> v1 { v0, v0, v0, v0 };
    std::vector<double> v4 = v1;
    double v3 = v0;
    const double v6 = v1[3];
    std::vector<double> v8 = v4;
    v3 = v0;
    std::vector<double> v5 = v4;
    const double v2 = v3 / v6;
    v4[2] = v0;
    v8[1] = v2;
    const double v11 = v4[3];
    double v14 = v11;
    const double v18 = v5[2];
    v4[0] = v3;
    const double v9 = v1[2];
    v4[2] = v18;
    double v23 = v14;
    v4[3] = v2;
    v8 = v5;
    std::vector<double> v35 = v5;
    const double v10 = v35[3];
    double v16 = v23;
    const std::vector<double> v32 { v23, v6 };
    const double v21 = v16 * v23;
    double v22 = v10;
    v5[2] = v11;
    v5[2] = v11;
    std::vector<double> v36 = v32;
    const double v24 = v8[3];
    std::vector<double> v31 = v36;
    const double v52 = v31[0];
    v5[1] = v24;
    std::vector<double> v45 = v36;
    std::vector<double> v66 = v45;
    const std::vector<std::vector<double>> v44 { v66, v36 };
    const std::vector<double> v46 = v44[0];
    v31[1] = v21;
    std::vector<std::vector<double>> v41 = v44;
    v4[1] = v52;
    v4[3] = v9;
    const std::vector<std::vector<std::vector<double>>> v139 { v41, v44, v41, v41, v41 };
    const double v143 = v46[0];
    v23 = v21;
    v8[1] = v22;
    std::vector<double> v132 = v1;
    const std::vector<std::vector<double>> v72 = v139[2];
    const std::vector<double> v85 = v72[1];
    v4[2] = v18;
    const double v167 = v85[0];
    v8 = v132;
    double v150 = v167;
    v31[1] = v143;
    return v150;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const s1 &v1, const std::vector<s7> &v2, const std::vector<s4> &v3, const std::vector<std::vector<s0>> &v4, const s3 &v5, const double &v6) {
    const std::vector<s0> v20 = v5.p0;
    const double v17 = f7(v6);
    double v50 = v17;
    std::vector<s0> v77 = v20;
    const s0 v56 = v77[1];
    const std::vector<std::vector<double>> v99 = v56.p0;
    const std::vector<double> v71 = v99[1];
    const double v113 = v71[0];
    const double v64 = v113 + v50;
    double v107 = v64;
    return v107;
  }
  int main() {
    std::vector<s7> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } }, { { { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } }, { { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } } }, { { { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } } } } }, { { { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } }, { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { { { { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } } }, { { { 52.0 }, { 53.0 } }, { { 54.0 }, { 55.0 } } } } }, { { { { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } } } } }, { { { { { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } } } } } }, { { { { { { { 72.0 }, { 73.0 } }, { { 74.0 }, { 75.0 } } } }, { { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } } } } } });
    s1 v1({ { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 } } } }, { { { 84.0 }, { 85.0 } }, { { 86.0 }, { 87.0 } } } });
    std::vector<s7> v2({ { { { { { { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } }, { { { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } } } } }, { { { { { { { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } }, { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 } } } } }, { { { { { { 104.0 }, { 105.0 } }, { { 106.0 }, { 107.0 } } } }, { { { 108.0 }, { 109.0 } }, { { 110.0 }, { 111.0 } } } } }, { { { { { { 112.0 }, { 113.0 } }, { { 114.0 }, { 115.0 } } } }, { { { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } } }, { { { { { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 } } } }, { { { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } } } } } } } }, { { { { { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 } }, { { 134.0 }, { 135.0 } } } } }, { { { { { { { { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } }, { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 } } } } }, { { { { { { 144.0 }, { 145.0 } }, { { 146.0 }, { 147.0 } } } }, { { { 148.0 }, { 149.0 } }, { { 150.0 }, { 151.0 } } } } }, { { { { { { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } } } }, { { { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } } } } }, { { { { { { { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 } } } }, { { { 164.0 }, { 165.0 } }, { { 166.0 }, { 167.0 } } } } } } } } });
    std::vector<s4> v3({ { { { { { { { 168.0 }, { 169.0 } }, { { 170.0 }, { 171.0 } } } }, { { { 172.0 }, { 173.0 } }, { { 174.0 }, { 175.0 } } } }, { { { { { 176.0 }, { 177.0 } }, { { 178.0 }, { 179.0 } } } }, { { { 180.0 }, { 181.0 } }, { { 182.0 }, { 183.0 } } } } }, { { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 } } } }, { { { { { { { 188.0 }, { 189.0 } }, { { 190.0 }, { 191.0 } } } }, { { { 192.0 }, { 193.0 } }, { { 194.0 }, { 195.0 } } } }, { { { { { 196.0 }, { 197.0 } }, { { 198.0 }, { 199.0 } } } }, { { { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 } } } } }, { { { 204.0 }, { 205.0 } }, { { 206.0 }, { 207.0 } } } } });
    std::vector<std::vector<s0>> v4({ { { { { 208.0 }, { 209.0 } }, { { 210.0 }, { 211.0 } } } }, { { { { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 } } } }, { { { { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } } } } });
    s3 v5({ { { { { 220.0 }, { 221.0 } }, { { 222.0 }, { 223.0 } } }, { { { 224.0 }, { 225.0 } }, { { 226.0 }, { 227.0 } } } } });
    double v6(228.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5, v6);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
