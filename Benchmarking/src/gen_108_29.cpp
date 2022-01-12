  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const s1 &v1, const double &v2) {
    std::vector<std::vector<s0>> v6 = v0;
    const std::vector<s0> v4 = v6[0];
    const s0 v7 = v4[0];
    const s0 v3 = v4[0];
    const std::vector<std::vector<double>> v9 = v3.p0;
    const std::vector<s0> v26 = v0[1];
    const std::vector<double> v23 = v9[0];
    const std::vector<std::vector<double>> v29 = v7.p0;
    std::vector<std::vector<double>> v42 = v29;
    const std::vector<double> v27 = v42[0];
    std::vector<std::vector<double>> v46 = v42;
    v6[2] = v4;
    v46[2] = v23;
    std::vector<double> v59 = v27;
    v42[2] = v59;
    const std::vector<double> v78 = v29[2];
    v46[2] = v78;
    const std::vector<double> v93 = v29[0];
    v46[1] = v93;
    const std::vector<double> v178 = v46[1];
    v6[2] = v26;
    const double v183 = v178[0];
    v46[2] = v23;
    return v183;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } } } }, { { { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } } } } });
    s1 v1({ { { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } } } });
    double v2(15.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
