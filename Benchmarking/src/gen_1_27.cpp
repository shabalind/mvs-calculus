  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f37(const double &v0) {
    double v2 = v0;
    double v7 = v0;
    double v6 = v2;
    double v1 = v0;
    double v3 = v2;
    v6 = v1;
    double v9 = v2;
    double v20 = v3;
    const std::vector<double> v15 { v7, v20, v3, v9, v3 };
    std::vector<double> v11 = v15;
    v11[1] = v6;
    const double v23 = v15[0];
    std::vector<double> v27 = v11;
    const double v17 = v27[3];
    v11[1] = v17;
    v27[1] = v23;
    std::vector<double> v30 = v27;
    std::vector<double> v37 = v30;
    const double v33 = v37[2];
    double v34 = v33;
    return v34;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    double v3 = v2;
    const double v8 = f37(v2);
    double v5 = v8;
    const double v11 = f37(v5);
    const double v23 = v11 + v3;
    const double v50 = f37(v23);
    return v50;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } });
    double v2(21.0);
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
