  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f27(const s0 &v0) {
    const std::vector<s0> v5 { v0, v0, v0, v0, v0 };
    const s0 v3 = v5[4];
    s0 v2 = v3;
    const s0 v1 = v5[0];
    const std::vector<std::vector<double>> v10 = v1.p1;
    v2.p1 = v10;
    std::vector<std::vector<double>> v9 = v10;
    v2.p1 = v9;
    return v2;
  }
  s0 f26(const s0 &v0, const s0 &v1) {
    const s0 v3 = f27(v1);
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<double> v7 = v4[1];
    std::vector<std::vector<double>> v6 = v4;
    const s0 v5 = f27(v3);
    v6[1] = v7;
    s0 v17 = v5;
    v17.p1 = v4;
    const std::vector<std::vector<double>> v25 = v5.p1;
    std::vector<std::vector<double>> v16 = v6;
    v17.p1 = v16;
    const s0 v73 = f27(v17);
    v17.p1 = v25;
    return v73;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v4 = v0[0];
    const s0 v3 = v0[0];
    const std::vector<std::vector<double>> v6 = v4.p1;
    const std::vector<std::vector<double>> v9 = v3.p1;
    const s0 v13 = v0[0];
    const s0 v11 = f26(v13, v4);
    const std::vector<std::vector<double>> v23 = v11.p1;
    std::vector<std::vector<double>> v19 = v23;
    const std::vector<std::vector<double>> v30 = v3.p0;
    std::vector<std::vector<double>> v35 = v23;
    v35 = v6;
    v19 = v35;
    const std::vector<double> v21 = v30[0];
    v19[0] = v21;
    v19[0] = v21;
    v19[0] = v21;
    const std::vector<double> v86 = v19[1];
    v35 = v9;
    const std::vector<double> v54 = v6[1];
    const double v53 = v21[0];
    const double v66 = v86[0];
    const double v87 = v53 * v66;
    std::vector<double> v62 = v54;
    v19[1] = v62;
    return v87;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } } });
    double v1(3.0);
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
