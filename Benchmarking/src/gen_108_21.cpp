  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s5(s2 v0): p0(v0) { }
  };
  s5 f31(const s5 &v0) {
    const s2 v3 = v0.p0;
    const s5 v7(v3);
    const s2 v14 = v7.p0;
    const std::vector<s2> v21 { v3, v3, v14, v3 };
    const s2 v26 = v21[0];
    s5 v36 = v0;
    const s2 v24 = v21[2];
    v36.p0 = v26;
    v36.p0 = v24;
    s5 v107 = v36;
    return v107;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    const s5 v9 = v0[2];
    const s5 v8 = v0[2];
    const s2 v16 = v9.p0;
    const s5 v11 = f31(v8);
    const s2 v10 = v11.p0;
    const s2 v32 = v9.p0;
    s2 v45 = v16;
    v45 = v10;
    const s0 v52 = v32.p0;
    const s0 v31 = v45.p1;
    const std::vector<std::vector<double>> v79 = v31.p0;
    s0 v74 = v52;
    std::vector<std::vector<double>> v87 = v79;
    const std::vector<std::vector<double>> v47 = v74.p0;
    const std::vector<double> v118 = v87[2];
    const std::vector<double> v66 = v47[2];
    v87[0] = v66;
    std::vector<std::vector<double>> v78 = v47;
    const std::vector<double> v129 = v79[2];
    v78[2] = v129;
    const double v132 = v118[0];
    const std::vector<double> v134 = v78[0];
    v87[2] = v134;
    return v132;
  }
  int main() {
    std::vector<s5> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } }, { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } });
    double v1(24.0);
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
