  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s1>> p0;
    std::vector<s1> p1;
    s4(std::vector<std::vector<s1>> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  double f70(const double &v0) {
    const std::vector<double> v6 { v0, v0 };
    std::vector<double> v1 = v6;
    const double v3 = v6[1];
    const double v5 = v6[1];
    const double v9 = v6[1];
    const double v10 = v0 - v3;
    const std::vector<std::vector<double>> v2 { v1, v6, v1, v1 };
    v1[0] = v0;
    double v12 = v5;
    double v31 = v0;
    std::vector<std::vector<double>> v19 = v2;
    std::vector<double> v21 = v1;
    std::vector<double> v13 = v1;
    v19[2] = v13;
    const std::vector<double> v17 = v2[0];
    v1[1] = v10;
    const std::vector<double> v15 = v2[3];
    v21 = v15;
    const std::vector<double> v16 = v19[2];
    v13[0] = v12;
    double v38 = v0;
    v1[1] = v9;
    const std::vector<double> v43 = v19[2];
    std::vector<std::vector<double>> v20 = v2;
    std::vector<std::vector<double>> v40 = v19;
    v19[2] = v13;
    const std::vector<double> v22 = v20[1];
    const double v57 = v43[0];
    std::vector<double> v25 = v16;
    const double v32 = v25[0];
    std::vector<std::vector<double>> v85 = v40;
    std::vector<std::vector<double>> v26 = v85;
    v13 = v17;
    const std::vector<double> v61 { v3, v57, v31, v32, v10, v38 };
    v25 = v21;
    std::vector<double> v70 = v61;
    std::vector<double> v82 = v25;
    v85[2] = v82;
    v85 = v26;
    const double v67 = v70[3];
    std::vector<std::vector<double>> v100 = v85;
    v19[0] = v22;
    v19 = v100;
    return v67;
  }
  double f67(const double &v0) {
    const double v6 = f70(v0);
    const std::vector<double> v5 { v0 };
    const double v4 = f70(v6);
    const double v10 = v5[0];
    const double v1 = v5[0];
    const double v7 = f70(v10);
    std::vector<double> v3 = v5;
    const double v2 = v3[0];
    const double v9 = f70(v10);
    const double v11 = v7 - v6;
    v3[0] = v1;
    double v13 = v9;
    double v17 = v13;
    const double v14 = f70(v11);
    const double v26 = f70(v2);
    v13 = v0;
    const double v41 = f70(v17);
    const double v28 = v4 + v26;
    const std::vector<double> v25 { v17, v14, v2, v28, v0 };
    std::vector<double> v29 = v25;
    const double v42 = v29[0];
    const double v68 = v42 / v41;
    return v68;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const double v6 = f67(v1);
    const double v7 = f67(v6);
    const double v39 = f70(v7);
    return v39;
  }
  int main() {
    s4 v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } }, { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } });
    double v1(24.0);
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
