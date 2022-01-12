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
    s1(std::vector<std::vector<s0>> v0): p0(v0) { }
  };
  struct s2 {
    s1 p0;
    s2(s1 v0): p0(v0) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s0 p1;
    s3(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s1 p1;
    s4(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s1> p0;
    s4 p1;
    s6(std::vector<s1> v0, s4 v1): p0(v0), p1(v1) { }
  };
  double f50(const double &v0) {
    double v4 = v0;
    double v1 = v4;
    double v5 = v1;
    double v3 = v0;
    double v2 = v4;
    double v6 = v1;
    v2 = v0;
    double v7 = v0;
    double v8 = v7;
    double v11 = v5;
    double v9 = v2;
    double v15 = v6;
    double v27 = v9;
    double v24 = v8;
    double v21 = v24;
    double v23 = v21;
    double v28 = v11;
    const std::vector<double> v22 { v11, v5, v7 };
    const double v36 = v22[2];
    std::vector<double> v57 = v22;
    std::vector<double> v40 = v57;
    v40[1] = v0;
    std::vector<double> v71 = v22;
    v11 = v28;
    std::vector<double> v47 = v71;
    const double v37 = v57[2];
    const double v44 = v40[0];
    const double v39 = v22[2];
    v47[2] = v23;
    v40[2] = v39;
    v47[1] = v4;
    v40[2] = v6;
    v47[1] = v28;
    v40[2] = v11;
    v9 = v15;
    v40[1] = v37;
    v47[0] = v36;
    std::vector<double> v50 = v47;
    std::vector<double> v76 = v40;
    v50[2] = v24;
    v47[0] = v5;
    double v35 = v5;
    const double v46 = v40[0];
    const double v110 = v47[2];
    double v42 = v1;
    v50[2] = v44;
    std::vector<double> v156 = v76;
    v71[1] = v3;
    v47[2] = v46;
    const double v81 = v50[1];
    v57[1] = v27;
    const double v88 = v156[1];
    std::vector<double> v102 = v156;
    v28 = v88;
    v76[2] = v35;
    v40[0] = v110;
    const double v106 = v102[1];
    double v176 = v81;
    v1 = v42;
    v24 = v106;
    return v176;
  }
  double f28(const double &v0) {
    const double v1 = f50(v0);
    const std::vector<double> v5 { v1, v1, v1, v0, v1 };
    double v6 = v0;
    const double v4 = v5[3];
    const std::vector<double> v2 { v0, v4, v6, v4, v4, v4, v4 };
    double v7 = v6;
    v6 = v7;
    const double v10 = v2[4];
    std::vector<double> v23 = v2;
    const double v28 = v23[4];
    std::vector<double> v44 = v2;
    const double v42 = f50(v28);
    const double v27 = f50(v42);
    v23[5] = v4;
    std::vector<double> v38 = v44;
    v38[0] = v27;
    v23[0] = v10;
    const double v91 = v38[2];
    return v91;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    const double v5 = f50(v1);
    const double v3 = f28(v5);
    double v9 = v3;
    const double v53 = f50(v9);
    return v53;
  }
  int main() {
    s6 v0({ { { { { { { { 0.0 } }, { { 1.0 } } } } } } }, { { { { { { { { { { { 2.0 } }, { { 3.0 } } } } } } }, { { { { { { { 4.0 } }, { { 5.0 } } } } } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { { { { { 8.0 } }, { { 9.0 } } } } } } }, { { { { { { { 10.0 } }, { { 11.0 } } } } } } } }, { { { 12.0 } }, { { 13.0 } } } }, { { { { { { { { { 14.0 } }, { { 15.0 } } } } } } }, { { { { { { { 16.0 } }, { { 17.0 } } } } } } } }, { { { 18.0 } }, { { 19.0 } } } } }, { { { { { { 20.0 } }, { { 21.0 } } } } } } } });
    double v1(22.0);
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
