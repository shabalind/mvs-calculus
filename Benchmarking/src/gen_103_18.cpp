  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f22(const double &v0) {
    double v5 = v0;
    double v2 = v0;
    double v7 = v5;
    v2 = v7;
    double v4 = v7;
    double v8 = v4;
    double v6 = v2;
    double v1 = v0;
    double v11 = v0;
    double v17 = v8;
    const std::vector<double> v10 { v8, v6 };
    std::vector<double> v16 = v10;
    v16[1] = v17;
    const double v38 = v8 / v11;
    std::vector<double> v9 = v16;
    double v30 = v8;
    v16 = v10;
    std::vector<double> v23 = v10;
    double v15 = v1;
    double v22 = v2;
    const double v51 = v10[0];
    v16[1] = v51;
    const double v20 = v51 / v22;
    std::vector<double> v42 = v10;
    v16[0] = v15;
    const double v61 = v10[1];
    const double v21 = v16[0];
    const double v19 = v10[0];
    const std::vector<double> v29 { v21, v7, v51, v5 };
    v16[1] = v19;
    std::vector<double> v33 = v9;
    v33 = v9;
    const std::vector<std::vector<double>> v85 { v29, v29, v29, v29, v29 };
    const double v27 = v10[0];
    v42[0] = v30;
    std::vector<double> v55 = v29;
    const double v37 = v5 * v0;
    const double v35 = v55[2];
    const double v80 = v33[1];
    const double v36 = v23[0];
    const std::vector<double> v59 = v85[2];
    const double v122 = v59[3];
    const std::vector<double> v57 { v6, v1, v35 };
    v16 = v42;
    std::vector<double> v93 = v57;
    const double v165 = v57[1];
    const double v104 = v93[1];
    const double v44 = v33[0];
    v23[0] = v27;
    v93 = v57;
    const std::vector<double> v107 { v38, v15, v36, v37, v80, v104, v61 };
    std::vector<double> v202 = v107;
    const double v65 = v202[2];
    double v128 = v44;
    v33[1] = v165;
    v9[0] = v21;
    v55[3] = v20;
    v202[3] = v122;
    v23[1] = v128;
    return v65;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<double> v3 = v7[2];
    const std::vector<double> v8 = v11[1];
    const double v13 = f22(v1);
    double v27 = v13;
    std::vector<std::vector<double>> v19 = v11;
    v19[0] = v8;
    const std::vector<double> v23 = v19[0];
    v19[1] = v3;
    const double v31 = v23[0];
    const double v251 = f22(v27);
    const double v74 = v31 * v251;
    return v74;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    double v1(5.0);
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
