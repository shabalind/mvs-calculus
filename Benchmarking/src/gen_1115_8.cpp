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
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v7 = v0[1];
    const s1 v3 = v0[0];
    std::vector<s1> v5 = v0;
    const s1 v6 = v5[1];
    v5[1] = v3;
    std::vector<s1> v8 = v0;
    v8[1] = v6;
    const s1 v21 = v8[0];
    v8[1] = v7;
    v5[1] = v6;
    const s1 v12 = v5[1];
    const s0 v17 = v21.p0;
    const std::vector<double> v10 { v1 };
    const s1 v27 = v0[0];
    const std::vector<std::vector<double>> v20 = v17.p0;
    s1 v25 = v27;
    const std::vector<std::vector<double>> v29 = v17.p0;
    const s0 v32 = v12.p1;
    const s0 v36 = v12.p0;
    v25.p0 = v36;
    std::vector<std::vector<double>> v30 = v29;
    const s0 v39(v30, v30);
    v25.p0 = v39;
    const std::vector<double> v93 = v20[1];
    std::vector<std::vector<double>> v59 = v30;
    s1 v84 = v25;
    v30[0] = v93;
    const std::vector<double> v72 = v59[0];
    v84 = v7;
    v84.p0 = v32;
    v59[0] = v10;
    std::vector<double> v52 = v72;
    v5[1] = v84;
    v30[1] = v72;
    v30[0] = v93;
    const double v138 = v52[0];
    return v138;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } } });
    double v1(16.0);
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
