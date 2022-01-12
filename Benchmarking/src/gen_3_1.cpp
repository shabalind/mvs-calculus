  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f8(const double &v0) {
    double v6 = v0;
    v6 = v0;
    v6 = v0;
    double v9 = v0;
    double v2 = v9;
    double v7 = v6;
    double v5 = v7;
    const std::vector<double> v3 { v6, v5, v5, v5, v0, v5, v6 };
    std::vector<double> v21 = v3;
    v21[5] = v0;
    const double v12 = v21[4];
    v21[1] = v0;
    v21[2] = v6;
    std::vector<double> v14 = v21;
    double v13 = v2;
    std::vector<double> v20 = v21;
    v20[0] = v6;
    double v35 = v0;
    const double v18 = v14[2];
    std::vector<double> v22 = v3;
    double v19 = v13;
    v14 = v3;
    double v36 = v35;
    v20[1] = v9;
    const double v25 = v20[4];
    v14[4] = v12;
    std::vector<double> v76 = v21;
    v22[4] = v25;
    double v43 = v18;
    v22[6] = v7;
    double v15 = v13;
    const double v26 = v76[5];
    double v23 = v12;
    const double v27 = v22[5];
    v22[2] = v15;
    const std::vector<double> v40 { v5, v25, v27, v26 };
    v76 = v22;
    double v31 = v35;
    std::vector<double> v38 = v40;
    const double v29 = v21[2];
    const std::vector<double> v48 { v43, v36, v36, v25, v29 };
    v22[6] = v27;
    const double v55 = v48[2];
    const double v32 = v3[3];
    const double v39 = v3[0];
    const double v171 = v21[4];
    double v69 = v55;
    std::vector<double> v56 = v48;
    v38[3] = v15;
    v14[0] = v23;
    const double v79 = v56[4];
    v76[3] = v19;
    const double v58 = v48[2];
    v19 = v32;
    v69 = v171;
    const double v118 = v38[3];
    v38[3] = v0;
    v38[2] = v31;
    const double v143 = v38[2];
    v20[6] = v58;
    v69 = v143;
    v38[2] = v39;
    v22[1] = v79;
    v20[2] = v118;
    return v69;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v8 = f8(v1);
    double v19 = v8;
    return v19;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { 0.0, { { 1.0 }, { 2.0 } } }, { { { 3.0, { { 4.0 }, { 5.0 } } } }, { { 6.0, { { 7.0 }, { 8.0 } } } }, { { 9.0, { { 10.0 }, { 11.0 } } } } } } } });
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
