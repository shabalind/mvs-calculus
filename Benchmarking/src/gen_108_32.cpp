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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s3(s2 v0): p0(v0) { }
  };
  struct s4 {
    std::vector<std::vector<double>> p0;
    s1 p1;
    s4(std::vector<std::vector<double>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s4 p0;
    std::vector<std::vector<double>> p1;
    s9(s4 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f82(const double &v0) {
    double v5 = v0;
    v5 = v0;
    double v2 = v0;
    double v7 = v5;
    double v3 = v0;
    double v10 = v2;
    double v4 = v7;
    v4 = v3;
    double v14 = v2;
    const double v1 = v14 + v10;
    double v12 = v3;
    const std::vector<double> v8 { v10, v12 };
    const double v11 = v14 - v4;
    std::vector<double> v9 = v8;
    std::vector<double> v21 = v8;
    double v20 = v0;
    v21[1] = v5;
    v21[0] = v2;
    const double v35 = v9[0];
    v21[1] = v4;
    v21[0] = v20;
    const double v18 = v9[0];
    v9[1] = v1;
    v9[1] = v1;
    v9[0] = v14;
    v9[0] = v11;
    v2 = v18;
    v21[0] = v35;
    std::vector<double> v40 = v21;
    v21[1] = v7;
    std::vector<double> v24 = v8;
    const double v48 = v8[1];
    const double v19 = v9[0];
    std::vector<double> v25 = v8;
    v24[1] = v19;
    std::vector<double> v56 = v25;
    double v34 = v0;
    std::vector<double> v36 = v40;
    v21[1] = v48;
    std::vector<double> v39 = v25;
    double v64 = v34;
    const std::vector<std::vector<double>> v45 { v39, v56, v36, v21, v24, v21, v24 };
    std::vector<std::vector<double>> v70 = v45;
    v36[0] = v64;
    std::vector<std::vector<double>> v71 = v70;
    const double v132 = v5 - v19;
    const double v124 = v56[0];
    v12 = v14;
    v39[0] = v124;
    v71[3] = v56;
    std::vector<std::vector<double>> v163 = v71;
    const std::vector<double> v75 = v163[6];
    const double v102 = v75[1];
    v3 = v132;
    return v102;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s9 &v1, const std::vector<std::vector<s3>> &v2, const double &v3) {
    const double v5 = f82(v3);
    const double v6 = f82(v3);
    const double v48 = f82(v5);
    const double v30 = v6 + v6;
    const double v22 = v48 * v30;
    return v22;
  }
  int main() {
    s4 v0({ { { 0.0 } }, { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 } } }, { { { 13.0 }, { 14.0 }, { 15.0 } }, { { 16.0 } } } } } });
    s9 v1({ { { { 17.0 } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 } } }, { { { { 22.0 }, { 23.0 }, { 24.0 } }, { { 25.0 } } }, { { { 26.0 }, { 27.0 }, { 28.0 } }, { { 29.0 } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } } } } } }, { { 34.0 }, { 35.0 } } });
    std::vector<std::vector<s3>> v2({ { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } } }, { { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } } } } });
    double v3(52.0);
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
