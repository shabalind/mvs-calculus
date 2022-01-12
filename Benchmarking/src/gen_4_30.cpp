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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s1 p1;
    s3(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s1 p0;
    std::vector<std::vector<s3>> p1;
    s9(s1 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  double f47(const double &v0) {
    const double v5 = v0 / v0;
    double v3 = v5;
    double v13 = v3;
    v3 = v5;
    double v10 = v13;
    double v1 = v10;
    double v14 = v1;
    double v21 = v14;
    double v20 = v21;
    return v20;
  }
  double f15(const double &v0) {
    const double v4 = v0 / v0;
    const double v1 = f47(v4);
    const std::vector<double> v2 { v1, v1, v4, v4 };
    const double v5 = f47(v0);
    double v8 = v1;
    std::vector<double> v7 = v2;
    const double v6 = v7[2];
    v7[2] = v1;
    v7[2] = v4;
    const double v9 = v2[2];
    std::vector<double> v12 = v2;
    const double v14 = f47(v9);
    const double v10 = f47(v0);
    std::vector<double> v11 = v12;
    const double v18 = v7[1];
    std::vector<double> v21 = v11;
    const double v28 = v7[3];
    double v16 = v6;
    const double v22 = v5 + v4;
    const double v35 = f47(v22);
    double v19 = v18;
    v16 = v35;
    v12[3] = v6;
    v12[3] = v19;
    const std::vector<double> v36 { v35, v6, v10, v16 };
    v12[2] = v22;
    std::vector<double> v39 = v36;
    const double v40 = f47(v28);
    v12[1] = v5;
    const double v30 = v39[0];
    const double v29 = v21[3];
    const std::vector<std::vector<double>> v41 { v36, v39, v11, v2, v39 };
    v21 = v12;
    const double v57 = v21[3];
    std::vector<std::vector<double>> v55 = v41;
    double v83 = v8;
    v11[0] = v5;
    std::vector<std::vector<double>> v54 = v55;
    v7[2] = v57;
    const double v47 = f47(v83);
    v55 = v54;
    v11[2] = v29;
    const double v95 = v30 * v4;
    v21[2] = v28;
    v39[2] = v14;
    const std::vector<double> v34 = v54[1];
    v11[3] = v47;
    double v77 = v40;
    v21[2] = v77;
    v12[2] = v30;
    const double v66 = v34[3];
    v7[0] = v95;
    return v66;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const s1 v6 = v0.p0;
    const s0 v7 = v6.p1;
    double v18 = v1;
    const std::vector<std::vector<double>> v21 = v7.p0;
    const std::vector<double> v47 = v21[0];
    const double v74 = v47[0];
    const double v117 = f15(v74);
    const double v129 = f47(v18);
    const double v146 = v117 / v129;
    return v146;
  }
  int main() {
    s9 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } } } } } });
    double v1(32.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
