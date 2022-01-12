  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s2(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v2 = v0[1];
    const std::vector<s0> v3 = v2.p1;
    const s0 v10 = v3[2];
    const std::vector<std::vector<double>> v23 = v10.p0;
    const std::vector<std::vector<double>> v37 = v10.p0;
    const s0 v16 = v3[1];
    s0 v20 = v16;
    const std::vector<double> v24 = v23[0];
    s0 v28 = v16;
    std::vector<std::vector<double>> v25 = v23;
    v25[0] = v24;
    const std::vector<double> v21 = v37[0];
    v28.p0 = v37;
    const std::vector<std::vector<double>> v30 = v20.p0;
    s0 v34 = v20;
    const std::vector<std::vector<double>> v65 = v28.p1;
    v25[0] = v21;
    const std::vector<std::vector<double>> v26 = v10.p0;
    const std::vector<std::vector<double>> v46 = v20.p0;
    v34.p1 = v65;
    const std::vector<std::vector<double>> v75 = v20.p1;
    const std::vector<double> v64 = v65[0];
    v34.p1 = v65;
    v28.p0 = v23;
    const std::vector<std::vector<double>> v136 = v34.p1;
    v28.p0 = v46;
    v20.p1 = v136;
    v34.p0 = v26;
    const std::vector<std::vector<double>> v84 = v16.p1;
    std::vector<std::vector<double>> v69 = v30;
    v20.p0 = v25;
    const std::vector<double> v95 = v37[0];
    v20.p1 = v84;
    v20.p0 = v69;
    const double v120 = v64[0];
    v28.p1 = v65;
    v28.p1 = v75;
    v69[0] = v95;
    return v120;
  }
  int main() {
    std::vector<s2> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } });
    double v1(36.0);
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
