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
  struct s2 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    s2(std::vector<s1> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f78(const double &v0) {
    double v4 = v0;
    v4 = v0;
    double v6 = v0;
    double v1 = v4;
    double v8 = v6;
    v4 = v0;
    const double v5 = v8 * v6;
    v1 = v4;
    double v2 = v1;
    double v3 = v4;
    double v15 = v0;
    double v12 = v0;
    const std::vector<double> v32 { v6, v12 };
    const double v14 = v32[0];
    std::vector<double> v18 = v32;
    const double v11 = v18[0];
    const double v13 = v18[0];
    std::vector<double> v20 = v18;
    const double v30 = v20[0];
    v20[1] = v13;
    double v16 = v5;
    v18[0] = v30;
    std::vector<double> v28 = v32;
    v28[0] = v30;
    const double v27 = v18[0];
    v4 = v27;
    const std::vector<double> v26 { v5, v1, v2, v16, v4, v14, v8 };
    v18[0] = v14;
    std::vector<double> v36 = v18;
    v18[1] = v14;
    std::vector<double> v42 = v26;
    v42[2] = v2;
    const double v35 = v26[2];
    std::vector<double> v51 = v42;
    v42[3] = v1;
    const double v65 = v42[4];
    const double v31 = v36[0];
    const std::vector<std::vector<double>> v43 { v28, v20, v32 };
    v18[1] = v1;
    std::vector<double> v59 = v51;
    const std::vector<double> v50 = v43[2];
    v42[2] = v31;
    std::vector<double> v33 = v36;
    std::vector<std::vector<double>> v94 = v43;
    v15 = v35;
    std::vector<std::vector<double>> v99 = v43;
    const std::vector<double> v45 = v94[0];
    std::vector<double> v39 = v18;
    v59[6] = v5;
    std::vector<std::vector<double>> v103 = v99;
    v99 = v103;
    v51[0] = v30;
    v103[2] = v18;
    v59[1] = v3;
    std::vector<double> v130 = v50;
    v130[1] = v1;
    const double v56 = v45[0];
    const std::vector<double> v104 = v103[2];
    v51[0] = v56;
    v94[0] = v104;
    std::vector<double> v86 = v59;
    v42[6] = v30;
    v103[0] = v45;
    v28[1] = v11;
    std::vector<double> v126 = v36;
    v99[0] = v32;
    v86[0] = v65;
    const double v174 = v86[0];
    v28 = v126;
    v18 = v130;
    v103 = v43;
    v18[1] = v15;
    v94[2] = v33;
    v103[1] = v39;
    return v174;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    double v29 = v1;
    const double v27 = f78(v29);
    const double v33 = f78(v27);
    double v43 = v33;
    return v43;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } } });
    double v1(15.0);
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
