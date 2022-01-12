  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<double> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<double> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  std::vector<double> f55(const std::vector<double> &v0) {
    std::vector<double> v3 = v0;
    const double v1 = v0[0];
    double v6 = v1;
    const double v4 = v0[1];
    const double v2 = v3[0];
    v3[0] = v1;
    const double v10 = v0[0];
    v3[0] = v6;
    double v5 = v2;
    double v9 = v2;
    std::vector<double> v8 = v0;
    v3[0] = v1;
    v8[1] = v1;
    v8[0] = v4;
    const double v13 = v3[0];
    std::vector<double> v21 = v0;
    v21[0] = v4;
    v3[0] = v4;
    const double v45 = v8[1];
    std::vector<double> v12 = v3;
    const double v25 = v3[0];
    const double v34 = v8[1];
    double v23 = v25;
    v3[1] = v25;
    v8[1] = v34;
    const double v29 = v0[0];
    v8[1] = v1;
    v8[1] = v25;
    v8[0] = v45;
    v21[1] = v9;
    double v43 = v1;
    const double v24 = v0[1];
    double v50 = v1;
    const double v16 = v3[1];
    const double v18 = v12[1];
    std::vector<double> v19 = v8;
    const std::vector<std::vector<double>> v66 { v3, v19, v12, v3 };
    double v33 = v13;
    const std::vector<double> v55 = v66[2];
    std::vector<std::vector<double>> v83 = v66;
    const double v57 = v43 + v9;
    const double v82 = v21[0];
    const std::vector<std::vector<double>> v72 { v12, v8, v12, v55 };
    const std::vector<double> v31 = v83[0];
    v43 = v16;
    std::vector<std::vector<double>> v74 = v83;
    v12[0] = v82;
    const std::vector<double> v56 = v74[3];
    const std::vector<double> v54 = v66[1];
    std::vector<double> v42 = v56;
    v8[1] = v10;
    v3[1] = v50;
    const std::vector<double> v60 = v72[0];
    std::vector<double> v91 = v42;
    v12 = v91;
    std::vector<double> v38 = v60;
    double v63 = v5;
    v91[1] = v63;
    v74[2] = v19;
    const double v51 = v31[0];
    const double v69 = v31[1];
    double v76 = v51;
    v12[0] = v33;
    v8[0] = v24;
    const double v90 = v21[1];
    std::vector<double> v152 = v38;
    const std::vector<double> v180 = v66[3];
    v3[0] = v76;
    const std::vector<double> v103 { v18, v57, v45, v24, v6, v69, v63 };
    const double v73 = v103[3];
    v74[1] = v180;
    v8[1] = v90;
    v8[1] = v69;
    v152[0] = v9;
    v38[1] = v1;
    v74[0] = v54;
    v21[0] = v29;
    std::vector<double> v151 = v152;
    v151[0] = v82;
    v19[1] = v73;
    v38[1] = v23;
    return v151;
  }
  double f53(const double &v0) {
    double v7 = v0;
    double v5 = v0;
    double v2 = v5;
    const std::vector<double> v6 { v0, v0 };
    std::vector<double> v8 = v6;
    const double v10 = v6[1];
    const std::vector<double> v9 = f55(v8);
    const double v13 = v9[1];
    const double v11 = v6[1];
    v8[0] = v2;
    v8[1] = v0;
    const std::vector<double> v21 { v13, v13, v11, v0, v13, v10, v10 };
    std::vector<double> v27 = v21;
    v27[6] = v11;
    std::vector<double> v15 = v21;
    v2 = v7;
    std::vector<double> v25 = v15;
    v27 = v25;
    v7 = v11;
    const double v68 = v27[3];
    return v68;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const double v6 = f53(v1);
    const std::vector<double> v3 = v0.p4;
    const double v11 = v3[1];
    double v4 = v11;
    v4 = v11;
    const double v15 = v4 / v6;
    double v49 = v15;
    return v49;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 } }, { { 4.0 } }, { 5.0, 6.0 } });
    double v1(7.0);
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
