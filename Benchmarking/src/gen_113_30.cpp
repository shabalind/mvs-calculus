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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f98(const double &v0) {
    double v2 = v0;
    double v1 = v2;
    double v10 = v1;
    double v5 = v1;
    v5 = v10;
    return v5;
  }
  double f40(const double &v0) {
    const double v6 = f98(v0);
    double v3 = v0;
    const double v1 = f98(v3);
    v3 = v6;
    double v4 = v0;
    v3 = v1;
    const double v26 = f98(v1);
    const double v28 = f98(v4);
    const double v23 = f98(v28);
    const double v71 = v23 * v26;
    return v71;
  }
  double f30(const double &v0) {
    double v2 = v0;
    const double v9 = f40(v2);
    double v4 = v0;
    double v3 = v4;
    double v18 = v4;
    const std::vector<double> v7 { v9 };
    const double v10 = f98(v3);
    std::vector<double> v19 = v7;
    std::vector<double> v30 = v7;
    std::vector<double> v29 = v30;
    v30[0] = v3;
    const double v21 = f98(v2);
    const double v24 = f98(v3);
    std::vector<double> v16 = v19;
    const double v12 = v16[0];
    v30[0] = v21;
    const double v34 = f40(v10);
    v16[0] = v24;
    double v31 = v18;
    std::vector<double> v51 = v16;
    const std::vector<std::vector<double>> v58 { v7, v16, v29 };
    const std::vector<double> v65 = v58[0];
    v30[0] = v24;
    const double v25 = v65[0];
    v51[0] = v34;
    std::vector<double> v47 = v29;
    const double v40 = f40(v31);
    const double v38 = v51[0];
    v30 = v47;
    v47[0] = v38;
    const double v48 = v51[0];
    const double v73 = f40(v9);
    v47[0] = v73;
    v30[0] = v40;
    v51[0] = v48;
    v19[0] = v12;
    return v25;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v5 = v1 - v1;
    const double v11 = f30(v5);
    const double v34 = v5 + v11;
    return v34;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } } } });
    double v1(10.0);
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
