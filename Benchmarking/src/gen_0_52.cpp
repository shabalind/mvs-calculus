  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    double p1;
    s1(s0 v0, double v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v5 = v0[0];
    const s1 v4 = v0[2];
    const double v8 = v4.p1;
    const s1 v3 = v0[0];
    const s0 v7 = v3.p0;
    const std::vector<std::vector<double>> v28 = v7.p0;
    const std::vector<double> v29 = v28[1];
    const std::vector<std::vector<double>> v23 = v7.p0;
    const double v33 = v5.p1;
    const double v26 = v1 / v8;
    std::vector<double> v35 = v29;
    const double v42 = v26 + v1;
    const double v19 = v35[0];
    v35[0] = v33;
    const std::vector<double> v30 = v23[0];
    std::vector<double> v43 = v29;
    const double v46 = v30[0];
    double v31 = v42;
    v35[0] = v42;
    v31 = v46;
    v43[0] = v19;
    v43[0] = v46;
    const double v92 = v35[0];
    v35[0] = v19;
    v35[0] = v92;
    const double v82 = v43[0];
    v43[0] = v19;
    v35[0] = v31;
    return v82;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } } }, 6.0 }, { { { { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 } } }, 13.0 }, { { { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, 20.0 } });
    double v1(21.0);
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
