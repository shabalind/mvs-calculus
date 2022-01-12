  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f67(const double &v0) {
    double v5 = v0;
    const std::vector<double> v3 { v5, v0 };
    const double v10 = v3[0];
    return v10;
  }
  double f12(const double &v0) {
    double v7 = v0;
    const double v1 = f67(v7);
    const double v5 = f67(v7);
    const double v3 = f67(v7);
    const double v6 = f67(v3);
    const double v2 = f67(v3);
    const double v10 = f67(v1);
    const std::vector<double> v8 { v5, v6, v2, v10, v10, v6 };
    std::vector<double> v14 = v8;
    const double v12 = f67(v7);
    const double v22 = v14[4];
    const double v24 = f67(v6);
    v14[4] = v2;
    const double v41 = f67(v22);
    v14[4] = v7;
    double v28 = v24;
    v14[3] = v22;
    const double v79 = f67(v22);
    v14[0] = v12;
    const std::vector<double> v71 { v5, v79 };
    std::vector<double> v42 = v71;
    std::vector<double> v119 = v42;
    const std::vector<std::vector<double>> v88 { v71, v71, v119 };
    v14[5] = v28;
    v7 = v41;
    const std::vector<double> v130 = v88[1];
    const double v149 = v130[1];
    return v149;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const double v13 = f12(v1);
    const double v8 = f12(v13);
    double v16 = v1;
    v16 = v8;
    double v12 = v16;
    v12 = v16;
    const double v79 = f67(v12);
    double v60 = v79;
    return v60;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    double v1(15.0);
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
