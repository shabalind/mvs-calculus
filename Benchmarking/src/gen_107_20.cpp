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
    s1(std::vector<s0> v0): p0(v0) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s3(std::vector<s1> v0): p0(v0) { }
  };
  struct s5 {
    std::vector<s1> p0;
    s0 p1;
    s5(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s6(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s5 p0;
    std::vector<s6> p1;
    s9(s5 v0, std::vector<s6> v1): p0(v0), p1(v1) { }
  };
  struct s12 {
    s5 p0;
    std::vector<s3> p1;
    s12(s5 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  double f112(const double &v0) {
    double v2 = v0;
    double v4 = v0;
    const double v7 = v2 + v2;
    double v8 = v7;
    double v1 = v4;
    double v3 = v4;
    const double v10 = v2 + v1;
    double v9 = v3;
    double v15 = v7;
    double v17 = v0;
    double v13 = v17;
    const double v14 = v9 * v0;
    double v18 = v4;
    double v20 = v18;
    const std::vector<double> v24 { v9, v1, v13, v4, v14 };
    std::vector<double> v42 = v24;
    std::vector<double> v26 = v24;
    v42[3] = v1;
    v42[1] = v10;
    double v33 = v8;
    v26[0] = v17;
    v42[0] = v2;
    v8 = v15;
    v42[3] = v9;
    const std::vector<std::vector<double>> v44 { v42, v24, v42, v26 };
    const std::vector<double> v139 = v44[0];
    v42[3] = v14;
    std::vector<std::vector<double>> v48 = v44;
    std::vector<std::vector<double>> v67 = v48;
    std::vector<std::vector<double>> v87 = v67;
    const std::vector<double> v45 = v87[1];
    v26[4] = v20;
    std::vector<double> v62 = v139;
    v42[0] = v0;
    const std::vector<std::vector<double>> v76 { v45, v62 };
    const std::vector<double> v147 = v76[0];
    const double v137 = v147[0];
    v42[1] = v33;
    return v137;
  }
  double f20(const double &v0) {
    const double v7 = f112(v0);
    double v3 = v7;
    const double v5 = v3 - v7;
    double v1 = v5;
    const double v10 = f112(v0);
    const double v6 = f112(v5);
    const double v2 = f112(v10);
    double v11 = v6;
    double v9 = v2;
    double v8 = v6;
    const std::vector<double> v16 { v0, v11, v7 };
    const double v12 = f112(v2);
    const double v26 = f112(v9);
    const double v20 = v16[1];
    std::vector<double> v21 = v16;
    double v17 = v5;
    const double v19 = v21[0];
    v21[1] = v8;
    v21[1] = v17;
    const double v51 = v19 / v3;
    v21[1] = v26;
    v21[0] = v1;
    const double v35 = f112(v12);
    v21[2] = v20;
    v9 = v35;
    return v51;
  }
  __attribute__((noinline))
  double f0(const std::vector<s9> &v0, const std::vector<std::vector<s12>> &v1, const double &v2) {
    const double v7 = f112(v2);
    const double v6 = f112(v7);
    const double v18 = f20(v7);
    const std::vector<double> v20 { v18 };
    const double v42 = v20[0];
    const double v115 = v6 - v42;
    const double v189 = f112(v115);
    return v189;
  }
  int main() {
    std::vector<s9> v0({ { { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 } } } } } }, { { { { { 22.0 } }, { { 23.0 } } }, { { { 24.0 } }, { { 25.0 } } } }, { { { { { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 } }, { { 29.0 } } } } } }, { { { { { 30.0 } }, { { 31.0 } } }, { { { 32.0 } }, { { 33.0 } } } }, { { { { { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 } } } } } } } }, { { { { { { { { 38.0 } }, { { 39.0 } } }, { { { 40.0 } }, { { 41.0 } } } } }, { { { { { 42.0 } }, { { 43.0 } } }, { { { 44.0 } }, { { 45.0 } } } } }, { { { { { 46.0 } }, { { 47.0 } } }, { { { 48.0 } }, { { 49.0 } } } } } }, { { { 50.0 } }, { { 51.0 } } } }, { { { { { { 52.0 } }, { { 53.0 } } }, { { { 54.0 } }, { { 55.0 } } } }, { { { { { 56.0 } }, { { 57.0 } } } }, { { { { 58.0 } }, { { 59.0 } } } } } }, { { { { { 60.0 } }, { { 61.0 } } }, { { { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 } }, { { 65.0 } } } }, { { { { 66.0 } }, { { 67.0 } } } } } }, { { { { { 68.0 } }, { { 69.0 } } }, { { { 70.0 } }, { { 71.0 } } } }, { { { { { 72.0 } }, { { 73.0 } } } }, { { { { 74.0 } }, { { 75.0 } } } } } } } }, { { { { { { { { 76.0 } }, { { 77.0 } } }, { { { 78.0 } }, { { 79.0 } } } } }, { { { { { 80.0 } }, { { 81.0 } } }, { { { 82.0 } }, { { 83.0 } } } } }, { { { { { 84.0 } }, { { 85.0 } } }, { { { 86.0 } }, { { 87.0 } } } } } }, { { { 88.0 } }, { { 89.0 } } } }, { { { { { { 90.0 } }, { { 91.0 } } }, { { { 92.0 } }, { { 93.0 } } } }, { { { { { 94.0 } }, { { 95.0 } } } }, { { { { 96.0 } }, { { 97.0 } } } } } }, { { { { { 98.0 } }, { { 99.0 } } }, { { { 100.0 } }, { { 101.0 } } } }, { { { { { 102.0 } }, { { 103.0 } } } }, { { { { 104.0 } }, { { 105.0 } } } } } }, { { { { { 106.0 } }, { { 107.0 } } }, { { { 108.0 } }, { { 109.0 } } } }, { { { { { 110.0 } }, { { 111.0 } } } }, { { { { 112.0 } }, { { 113.0 } } } } } } } } });
    std::vector<std::vector<s12>> v1({ { { { { { { { { { 114.0 } }, { { 115.0 } } }, { { { 116.0 } }, { { 117.0 } } } } }, { { { { { 118.0 } }, { { 119.0 } } }, { { { 120.0 } }, { { 121.0 } } } } }, { { { { { 122.0 } }, { { 123.0 } } }, { { { 124.0 } }, { { 125.0 } } } } } }, { { { 126.0 } }, { { 127.0 } } } }, { { { { { { { { 128.0 } }, { { 129.0 } } }, { { { 130.0 } }, { { 131.0 } } } } }, { { { { { 132.0 } }, { { 133.0 } } }, { { { 134.0 } }, { { 135.0 } } } } }, { { { { { 136.0 } }, { { 137.0 } } }, { { { 138.0 } }, { { 139.0 } } } } } } } } } }, { { { { { { { { { 140.0 } }, { { 141.0 } } }, { { { 142.0 } }, { { 143.0 } } } } }, { { { { { 144.0 } }, { { 145.0 } } }, { { { 146.0 } }, { { 147.0 } } } } }, { { { { { 148.0 } }, { { 149.0 } } }, { { { 150.0 } }, { { 151.0 } } } } } }, { { { 152.0 } }, { { 153.0 } } } }, { { { { { { { { 154.0 } }, { { 155.0 } } }, { { { 156.0 } }, { { 157.0 } } } } }, { { { { { 158.0 } }, { { 159.0 } } }, { { { 160.0 } }, { { 161.0 } } } } }, { { { { { 162.0 } }, { { 163.0 } } }, { { { 164.0 } }, { { 165.0 } } } } } } } } } } });
    double v2(166.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
