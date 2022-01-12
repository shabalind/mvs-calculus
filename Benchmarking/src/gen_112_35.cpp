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
  double f38(const double &v0) {
    double v6 = v0;
    v6 = v0;
    double v4 = v6;
    double v3 = v4;
    double v7 = v6;
    double v1 = v3;
    double v10 = v1;
    const double v8 = v6 * v10;
    double v13 = v4;
    v7 = v0;
    double v18 = v8;
    double v15 = v4;
    double v2 = v1;
    double v22 = v15;
    double v12 = v1;
    double v27 = v1;
    double v30 = v8;
    double v17 = v27;
    double v31 = v13;
    const double v19 = v7 - v7;
    v27 = v15;
    double v40 = v12;
    const std::vector<double> v25 { v40, v6, v10, v2, v30, v15 };
    std::vector<double> v120 = v25;
    v120[2] = v18;
    v120[1] = v1;
    std::vector<double> v52 = v25;
    v15 = v3;
    std::vector<double> v70 = v52;
    v70[4] = v31;
    v52[5] = v17;
    std::vector<double> v77 = v70;
    v52[0] = v17;
    v77 = v120;
    v70[2] = v18;
    v70[4] = v18;
    v70[1] = v19;
    const double v145 = v77[4];
    v70[5] = v22;
    return v145;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const double v19 = f38(v1);
    const double v33 = v19 * v1;
    const double v51 = f38(v33);
    return v51;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    double v1(8.0);
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
