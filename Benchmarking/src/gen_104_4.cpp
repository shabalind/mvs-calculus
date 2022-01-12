  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f74(const std::vector<s0> &v0) {
    const s0 v4 = v0[0];
    s0 v5 = v4;
    const s0 v1 = v0[0];
    const std::vector<std::vector<double>> v6 = v4.p1;
    const std::vector<double> v8 = v6[0];
    const s0 v9 = v0[0];
    s0 v3 = v5;
    const std::vector<double> v2 = v6[1];
    const std::vector<std::vector<double>> v14 = v9.p1;
    std::vector<std::vector<double>> v15 = v14;
    v5.p0 = v6;
    v15[1] = v2;
    v5.p0 = v6;
    const s0 v19 = v0[0];
    std::vector<s0> v21 = v0;
    s0 v24 = v3;
    s0 v51 = v5;
    v51.p1 = v15;
    v21[0] = v1;
    v15[1] = v8;
    std::vector<s0> v57 = v21;
    v21[0] = v51;
    v57[0] = v24;
    v5.p1 = v6;
    v21[0] = v19;
    v21[0] = v9;
    return v57;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v3 = v0[0];
    const std::vector<s0> v6 = f74(v3);
    std::vector<s0> v11 = v6;
    const std::vector<s0> v8 = f74(v11);
    const std::vector<s0> v10 = f74(v8);
    const s0 v24 = v8[0];
    s0 v29 = v24;
    const std::vector<std::vector<double>> v25 = v29.p1;
    const s0 v43 = v10[0];
    std::vector<std::vector<double>> v47 = v25;
    const std::vector<std::vector<double>> v63 = v29.p0;
    v29.p0 = v63;
    const std::vector<std::vector<double>> v39 = v43.p0;
    v29.p1 = v25;
    v29.p0 = v39;
    const std::vector<double> v117 = v47[1];
    v11[0] = v43;
    v29.p1 = v47;
    const double v72 = v117[0];
    return v72;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    double v1(12.0);
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
