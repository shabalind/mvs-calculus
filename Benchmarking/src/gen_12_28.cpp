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
  double f0(const s1 &v0, const double &v1) {
    const s0 v4 = v0.p1;
    const std::vector<s0> v2 { v4, v4, v4, v4, v4 };
    const s0 v6 = v2[1];
    const s0 v3 = v2[0];
    const s0 v7 = v0.p1;
    const std::vector<std::vector<double>> v9 = v3.p1;
    const std::vector<std::vector<double>> v19 = v6.p1;
    const std::vector<double> v31 = v19[1];
    const double v15 = v31[0];
    const std::vector<double> v45 = v9[2];
    const double v26 = v15 - v15;
    const std::vector<std::vector<double>> v40 = v7.p0;
    const std::vector<double> v51 = v40[0];
    std::vector<double> v36 = v31;
    v36[0] = v26;
    const double v68 = v51[0];
    v36[0] = v68;
    double v125 = v15;
    double v72 = v125;
    std::vector<double> v58 = v45;
    const double v80 = v72 - v15;
    std::vector<double> v59 = v31;
    const std::vector<std::vector<double>> v91 { v58, v45, v45, v36 };
    v36 = v59;
    const std::vector<double> v210 = v91[2];
    std::vector<double> v123 = v210;
    v58[0] = v80;
    const double v81 = v123[0];
    return v81;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
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
