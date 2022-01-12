  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f2(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v6 = v5.p1;
    v5.p1 = v6;
    v5.p1 = v6;
    v5.p1 = v6;
    const std::vector<std::vector<double>> v10 = v0.p1;
    std::vector<std::vector<double>> v9 = v10;
    v5.p1 = v9;
    return v5;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    double v7 = v1;
    s0 v6 = v0;
    double v5 = v7;
    v6.p1 = v3;
    const s0 v4 = f2(v6);
    const s0 v8 = f2(v0);
    const std::vector<double> v12 = v3[1];
    const std::vector<std::vector<double>> v10 = v4.p0;
    const s0 v15 = f2(v6);
    const s0 v13 = f2(v8);
    const std::vector<std::vector<double>> v17 = v4.p0;
    const s0 v9 = f2(v13);
    std::vector<double> v16 = v12;
    const std::vector<double> v24 = v17[0];
    const s0 v19 = f2(v4);
    v5 = v7;
    v6.p0 = v10;
    const s0 v18 = f2(v8);
    std::vector<std::vector<double>> v21 = v3;
    v6.p0 = v17;
    v6.p0 = v17;
    const std::vector<std::vector<double>> v23 = v8.p1;
    const double v36 = v24[0];
    v21[2] = v16;
    const double v46 = v24[0];
    const s0 v44 = f2(v15);
    v21[0] = v16;
    const std::vector<double> v31 = v10[0];
    v21[2] = v24;
    const std::vector<double> v47 = v17[0];
    std::vector<double> v35 = v16;
    const std::vector<std::vector<double>> v20 = v4.p1;
    v21[1] = v35;
    const std::vector<std::vector<double>> v42 = v13.p1;
    std::vector<std::vector<double>> v25 = v3;
    v6.p1 = v25;
    const std::vector<std::vector<std::vector<double>>> v41 { v3, v23, v20, v20, v3, v3 };
    const std::vector<std::vector<double>> v26 = v19.p1;
    v6.p0 = v10;
    const std::vector<double> v50 = v25[0];
    v6 = v44;
    const std::vector<std::vector<double>> v56 = v9.p0;
    std::vector<double> v62 = v12;
    v25[1] = v62;
    const std::vector<std::vector<double>> v105 = v15.p0;
    const std::vector<std::vector<std::vector<double>>> v58 { v42 };
    const std::vector<std::vector<double>> v54 = v41[5];
    v16[0] = v7;
    v6.p0 = v56;
    v35[0] = v7;
    v62[0] = v1;
    const s0 v197 = f2(v18);
    const std::vector<std::vector<double>> v33 = v58[0];
    v21[2] = v50;
    v21 = v54;
    const std::vector<double> v149 = v23[1];
    std::vector<std::vector<double>> v71 = v25;
    const s0 v83(v10, v54);
    const s0 v69 = f2(v18);
    const std::vector<std::vector<double>> v185 = v83.p0;
    v6 = v69;
    v21[0] = v149;
    const std::vector<std::vector<double>> v161 = v197.p0;
    const std::vector<double> v78 = v26[1];
    double v82 = v1;
    v62[0] = v46;
    v6.p0 = v161;
    const std::vector<double> v311 { v82, v1, v36, v5, v46, v36, v36 };
    const s0 v183(v185, v21);
    v16[0] = v36;
    v6.p0 = v105;
    v25[0] = v78;
    const std::vector<std::vector<double>> v72 = v183.p1;
    v25[2] = v47;
    const double v178 = v311[5];
    v6.p1 = v72;
    v6.p0 = v185;
    v71[0] = v31;
    v6.p1 = v33;
    v6.p1 = v71;
    v6.p0 = v161;
    return v178;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } });
    double v1(4.0);
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
