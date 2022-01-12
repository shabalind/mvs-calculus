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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f48(const double &v0) {
    double v4 = v0;
    double v6 = v0;
    double v7 = v0;
    double v3 = v6;
    double v11 = v6;
    double v1 = v7;
    double v15 = v4;
    v11 = v4;
    double v2 = v3;
    v11 = v3;
    const std::vector<double> v25 { v0, v0, v4, v7 };
    std::vector<double> v5 = v25;
    std::vector<double> v16 = v5;
    const double v14 = v4 - v15;
    v5[1] = v6;
    double v32 = v7;
    const double v10 = v25[1];
    v16[3] = v14;
    const double v8 = v25[1];
    const double v19 = v16[2];
    v16[2] = v32;
    std::vector<double> v18 = v16;
    v18[0] = v1;
    std::vector<double> v22 = v25;
    std::vector<double> v35 = v25;
    v5[0] = v8;
    v22[1] = v3;
    std::vector<double> v31 = v35;
    std::vector<double> v40 = v16;
    const double v34 = v31[1];
    double v49 = v11;
    v22[1] = v2;
    const double v46 = v22[0];
    v22[1] = v11;
    const double v138 = v25[3];
    double v57 = v4;
    const double v37 = v40[3];
    const double v48 = v31[0];
    v22[2] = v8;
    double v50 = v0;
    v16[1] = v49;
    v22[3] = v57;
    v22[3] = v6;
    v31[2] = v19;
    v22[2] = v50;
    double v58 = v138;
    v16[2] = v14;
    const double v38 = v18[0];
    v18[0] = v1;
    const std::vector<double> v55 { v6, v46, v10, v34, v37, v48 };
    std::vector<double> v54 = v55;
    std::vector<double> v97 = v54;
    v97[2] = v58;
    const double v85 = v97[0];
    v35[3] = v85;
    v31[1] = v50;
    v31[1] = v14;
    v16[0] = v57;
    v5[3] = v11;
    std::vector<double> v71 = v97;
    v5[0] = v4;
    v22[2] = v38;
    std::vector<double> v183 = v71;
    std::vector<double> v96 = v183;
    v96[5] = v32;
    const double v134 = v96[2];
    return v134;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v4 = v0.p0;
    const s0 v5 = v4[1];
    const std::vector<double> v11 { v1, v1, v1, v1, v1 };
    const double v6 = f48(v1);
    const double v24 = v11[0];
    std::vector<double> v15 = v11;
    const std::vector<std::vector<double>> v17 = v5.p1;
    const double v16 = v24 + v1;
    s0 v13 = v5;
    v13.p1 = v17;
    const std::vector<std::vector<double>> v21 = v13.p0;
    const double v43 = v1 / v1;
    v15[3] = v6;
    v15[3] = v24;
    const std::vector<double> v33 = v21[0];
    const double v55 = v15[2];
    v15[4] = v16;
    double v35 = v1;
    const double v27 = v33[0];
    v15[4] = v43;
    const double v19 = f48(v35);
    v15[1] = v19;
    v15[4] = v27;
    return v55;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } });
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
