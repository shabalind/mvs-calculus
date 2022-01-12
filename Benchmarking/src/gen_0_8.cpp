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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f108(const std::vector<double> &v0) {
    const double v4 = v0[1];
    double v2 = v4;
    double v7 = v2;
    std::vector<double> v5 = v0;
    std::vector<double> v11 = v5;
    v5[0] = v4;
    const double v18 = v0[0];
    v11[1] = v4;
    const double v13 = v18 - v4;
    const std::vector<double> v10 { v13, v18 };
    std::vector<double> v14 = v5;
    std::vector<double> v22 = v5;
    const std::vector<std::vector<double>> v12 { v14, v11, v11, v5, v14, v5 };
    const double v20 = v10[0];
    const double v30 = v22[0];
    const std::vector<std::vector<std::vector<double>>> v32 { v12, v12, v12, v12, v12 };
    std::vector<std::vector<std::vector<double>>> v43 = v32;
    double v57 = v30;
    double v58 = v57;
    v5[0] = v7;
    const std::vector<std::vector<double>> v40 = v43[0];
    v5[0] = v20;
    const std::vector<double> v85 = v40[2];
    v11[1] = v58;
    return v85;
  }
  double f106(const double &v0) {
    double v7 = v0;
    double v3 = v7;
    double v4 = v7;
    double v6 = v0;
    double v8 = v0;
    double v10 = v8;
    const std::vector<double> v11 { v6, v3, v4 };
    const double v5 = v11[2];
    const std::vector<double> v1 = f108(v11);
    std::vector<double> v13 = v1;
    const std::vector<double> v22 = f108(v13);
    v4 = v10;
    const std::vector<double> v64 = f108(v1);
    v13[1] = v5;
    const std::vector<double> v20 = f108(v22);
    const std::vector<double> v43 = f108(v22);
    const std::vector<double> v48 = f108(v11);
    const std::vector<double> v31 = f108(v64);
    double v38 = v8;
    const double v51 = v20[0];
    v8 = v38;
    const double v32 = v31[2];
    const double v19 = v43[2];
    const double v34 = v1[0];
    v13[1] = v0;
    double v97 = v10;
    const std::vector<double> v41 = f108(v48);
    v8 = v32;
    double v140 = v10;
    const std::vector<double> v85 { v34, v19, v32, v97, v140, v51, v6 };
    std::vector<double> v42 = v85;
    v42 = v85;
    const double v103 = v41[1];
    const double v81 = v42[4];
    std::vector<double> v87 = v85;
    std::vector<double> v100 = v87;
    v13[2] = v103;
    v100[2] = v81;
    const double v105 = v100[5];
    return v105;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v2 = f106(v1);
    const std::vector<double> v6 { v2 };
    const double v13 = f106(v2);
    double v20 = v1;
    const double v10 = f106(v13);
    const double v14 = v10 * v13;
    const double v21 = f106(v20);
    std::vector<double> v15 = v6;
    const double v23 = f106(v2);
    v15[0] = v21;
    v15 = v6;
    double v30 = v14;
    double v59 = v10;
    v15[0] = v13;
    std::vector<double> v40 = v15;
    v20 = v21;
    double v192 = v10;
    std::vector<double> v101 = v40;
    v101[0] = v30;
    v40 = v15;
    v40[0] = v59;
    v101[0] = v23;
    v40[0] = v30;
    v15[0] = v14;
    v15[0] = v30;
    v20 = v192;
    const double v224 = v101[0];
    return v224;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } } } }, { { { { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } } }, { { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } } } } }, { { { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } } }, { { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } } });
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
