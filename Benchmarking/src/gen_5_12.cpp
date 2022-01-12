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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<std::vector<s0>> v4 = v0.p1;
    const std::vector<s0> v6 = v4[0];
    const s0 v3 = v0.p0;
    const s0 v9 = v6[0];
    s0 v11 = v9;
    const std::vector<std::vector<double>> v16 = v3.p1;
    const std::vector<std::vector<double>> v21 = v11.p0;
    const std::vector<double> v13 = v16[1];
    const std::vector<std::vector<double>> v25 = v11.p0;
    const s0 v19 = v0.p0;
    std::vector<std::vector<double>> v51 = v16;
    std::vector<std::vector<double>> v29 = v51;
    const double v40 = v13[0];
    std::vector<std::vector<double>> v36 = v51;
    const std::vector<std::vector<double>> v35 = v19.p0;
    const std::vector<double> v39 = v29[0];
    const double v50 = v13[0];
    std::vector<double> v41 = v13;
    v41[0] = v40;
    std::vector<double> v44 = v41;
    v11.p1 = v36;
    v44 = v39;
    const std::vector<double> v27 = v29[2];
    v41[0] = v50;
    v36[2] = v39;
    const std::vector<double> v46 = v25[1];
    const std::vector<double> v97 = v35[1];
    const double v31 = v50 * v50;
    std::vector<std::vector<double>> v115 = v21;
    v11.p1 = v51;
    v44 = v97;
    v36[0] = v97;
    const std::vector<double> v126 = v25[1];
    v29[0] = v44;
    const double v80 = v27[0];
    double v134 = v31;
    v11.p0 = v115;
    const double v200 = v126[0];
    v134 = v80;
    v115[1] = v46;
    const double v76 = v200 * v134;
    return v76;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } });
    double v1(20.0);
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
