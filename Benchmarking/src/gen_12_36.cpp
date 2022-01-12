  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s1> p1;
    s2(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s0 p1;
    s3(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    s4(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s4> p0;
    std::vector<std::vector<s1>> p1;
    s7(std::vector<s4> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  double f45(const double &v0) {
    double v1 = v0;
    double v5 = v1;
    double v7 = v5;
    const std::vector<double> v3 { v5, v0, v0, v0, v1, v5 };
    std::vector<double> v4 = v3;
    std::vector<double> v6 = v4;
    double v2 = v1;
    v1 = v0;
    v6[1] = v2;
    const double v9 = v3[2];
    const double v10 = v6[4];
    double v12 = v9;
    const double v15 = v3[3];
    double v25 = v7;
    const double v29 = v6[5];
    const double v14 = v4[5];
    const double v17 = v3[3];
    std::vector<double> v11 = v4;
    const std::vector<double> v20 { v1, v12, v14 };
    std::vector<double> v13 = v20;
    v13[0] = v29;
    std::vector<double> v30 = v11;
    v6[4] = v25;
    v6[0] = v12;
    const double v21 = v13[1];
    std::vector<double> v50 = v13;
    v50[2] = v5;
    std::vector<double> v23 = v20;
    std::vector<double> v27 = v20;
    const double v18 = v50[1];
    v50 = v23;
    v30[4] = v9;
    const double v40 = v18 + v21;
    double v80 = v10;
    v13 = v27;
    const double v49 = v30[0];
    v27[2] = v17;
    double v63 = v49;
    const std::vector<double> v61 { v7 };
    v13[0] = v15;
    const double v65 = v61[0];
    v23[2] = v65;
    v13[1] = v5;
    v30[0] = v80;
    v6[2] = v63;
    return v40;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const std::vector<s3> &v1, const s2 &v2, const double &v3) {
    const double v4 = v3 * v3;
    const double v18 = v3 + v4;
    const double v27 = f45(v18);
    return v27;
  }
  int main() {
    s7 v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } }, { { { { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } } } } }, { { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } } }, { { { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } }, { { { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } } }, { { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } } } } } } });
    std::vector<s3> v1({ { { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } }, { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } }, { { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } } } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } }, { { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } }, { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } } } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } });
    s2 v2({ { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 } } }, { { { { { 125.0 }, { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } } }, { { { { { 130.0 }, { 131.0 }, { 132.0 } }, { { 133.0 }, { 134.0 } } } }, { { { { 135.0 }, { 136.0 }, { 137.0 } }, { { 138.0 }, { 139.0 } } } }, { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } } } } } }, { { { { 145.0 }, { 146.0 }, { 147.0 } }, { { 148.0 }, { 149.0 } } }, { { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 } } } }, { { { { 155.0 }, { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } } } }, { { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } } } } } } });
    double v3(165.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
