  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    std::vector<std::vector<s0>> v8 = v0;
    const std::vector<s0> v5 = v0[2];
    v8[1] = v5;
    const std::vector<s0> v7 = v8[2];
    v8 = v0;
    v8[2] = v5;
    const s0 v3 = v7[0];
    const std::vector<std::vector<double>> v6 = v3.p1;
    const std::vector<std::vector<double>> v9 = v3.p0;
    const std::vector<double> v12 = v6[0];
    v8[0] = v7;
    const std::vector<s0> v11 = v8[0];
    std::vector<double> v10 = v12;
    v10[0] = v1;
    const std::vector<s0> v36 = v8[1];
    v8[1] = v11;
    v10[0] = v1;
    v8[2] = v36;
    v10[0] = v1;
    const double v18 = v10[0];
    const std::vector<double> v39 = v9[1];
    v10[0] = v18;
    const double v48 = v39[0];
    const double v44 = v18 - v48;
    const std::vector<s0> v54 = v0[1];
    v8[2] = v54;
    v10[0] = v1;
    return v44;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } } });
    double v1(9.0);
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
