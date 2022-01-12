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
  double f111(const double &v0) {
    double v2 = v0;
    double v3 = v2;
    const double v6 = v0 - v3;
    double v5 = v6;
    return v5;
  }
  double f102(const double &v0) {
    const double v4 = f111(v0);
    double v7 = v4;
    double v2 = v4;
    double v8 = v2;
    const double v6 = f111(v7);
    const double v1 = f111(v6);
    const double v12 = f111(v1);
    double v15 = v8;
    const double v3 = f111(v12);
    v7 = v12;
    const double v5 = f111(v7);
    double v10 = v6;
    const double v13 = f111(v4);
    const double v19 = f111(v7);
    const double v24 = f111(v19);
    double v18 = v4;
    double v39 = v18;
    const double v11 = f111(v39);
    double v34 = v5;
    double v30 = v19;
    const double v40 = f111(v30);
    double v44 = v13;
    double v28 = v24;
    const std::vector<double> v35 { v11, v40, v44, v39, v10 };
    const std::vector<double> v38 { v34, v13, v2, v44, v15, v10 };
    const double v46 = f111(v3);
    std::vector<double> v31 = v35;
    const std::vector<std::vector<double>> v47 { v31, v31, v35 };
    const std::vector<double> v80 = v47[0];
    const double v67 = v38[3];
    v31[3] = v6;
    v31[4] = v46;
    const double v91 = v80[2];
    v31[0] = v67;
    v31[1] = v30;
    v31[1] = v28;
    return v91;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v4 = v0[0];
    const s1 v3 = v4[0];
    const s0 v6 = v3.p0;
    const std::vector<std::vector<double>> v14 = v6.p1;
    const std::vector<double> v29 = v14[1];
    const double v34 = v29[0];
    const double v62 = f102(v34);
    return v62;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } } }, { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } } } });
    double v1(18.0);
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
