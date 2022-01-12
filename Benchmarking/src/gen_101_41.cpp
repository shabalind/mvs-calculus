  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f28(const s0 &v0) {
    s0 v7 = v0;
    s0 v5 = v7;
    const std::vector<std::vector<double>> v4 = v5.p0;
    std::vector<std::vector<double>> v9 = v4;
    const std::vector<double> v1 = v4[0];
    v9[0] = v1;
    const std::vector<std::vector<std::vector<double>>> v6 { v4, v9, v4, v9, v4, v4, v9 };
    std::vector<std::vector<std::vector<double>>> v3 = v6;
    const double v10 = v1[0];
    const std::vector<std::vector<double>> v8 = v5.p1;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const std::vector<double> v2 = v8[0];
    const std::vector<std::vector<double>> v20 = v0.p0;
    std::vector<std::vector<double>> v15 = v8;
    std::vector<double> v13 = v1;
    std::vector<std::vector<std::vector<double>>> v17 = v6;
    v5.p1 = v15;
    const std::vector<std::vector<double>> v24 = v5.p0;
    const std::vector<std::vector<double>> v12 = v5.p1;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<std::vector<double>> v28 = v17[2];
    v3[2] = v28;
    const double v29 = v10 * v10;
    std::vector<double> v19 = v2;
    std::vector<double> v26 = v1;
    v9 = v14;
    v3[4] = v28;
    v5.p1 = v8;
    const std::vector<std::vector<double>> v39 = v6[2];
    s0 v46 = v0;
    std::vector<double> v23 = v26;
    const double v25 = v29 + v10;
    std::vector<std::vector<double>> v35 = v8;
    const std::vector<s0> v27 { v7, v5, v5 };
    s0 v57 = v46;
    v9[1] = v23;
    const s0 v67 = v27[1];
    const std::vector<std::vector<double>> v48 = v3[1];
    const std::vector<std::vector<double>> v44 = v46.p1;
    const std::vector<std::vector<double>> v37 = v67.p1;
    v5.p0 = v24;
    const std::vector<std::vector<double>> v81 = v0.p1;
    const s0 v61(v48, v12);
    v46.p0 = v11;
    const std::vector<std::vector<double>> v78 = v67.p1;
    const std::vector<std::vector<std::vector<double>>> v47 { v48, v39, v20 };
    v46 = v61;
    v9[2] = v19;
    v46.p1 = v44;
    v19[0] = v25;
    v5.p0 = v20;
    s0 v68 = v57;
    v46.p1 = v81;
    v9[2] = v13;
    const std::vector<std::vector<double>> v55 = v47[1];
    v5.p1 = v78;
    const std::vector<std::vector<double>> v53 = v6[1];
    v7 = v61;
    v17[1] = v53;
    s0 v186 = v68;
    v186.p1 = v35;
    v35 = v37;
    v15[0] = v26;
    v15[0] = v26;
    v68.p0 = v4;
    v186.p0 = v24;
    v186.p0 = v55;
    return v186;
  }
  s0 f10(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<double> v9 = v4[1];
    std::vector<std::vector<double>> v13 = v5;
    const s0 v15(v3, v13);
    v13[0] = v9;
    const std::vector<double> v16 = v13[0];
    v13 = v2;
    const s0 v142 = f28(v15);
    v13[0] = v16;
    const s0 v59 = f28(v142);
    return v59;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v7 = f28(v0);
    s0 v4 = v0;
    const std::vector<std::vector<double>> v2 = v4.p0;
    const s0 v6 = f10(v7);
    s0 v3 = v0;
    const s0 v8 = f28(v0);
    v4 = v8;
    const std::vector<std::vector<std::vector<double>>> v13 { v2, v2, v2, v2, v2 };
    const std::vector<std::vector<double>> v18 = v13[0];
    const std::vector<double> v16 = v18[0];
    v4.p0 = v2;
    v4.p0 = v18;
    const std::vector<std::vector<double>> v20 = v3.p1;
    v4.p1 = v20;
    const std::vector<std::vector<double>> v19 = v6.p1;
    v4.p1 = v19;
    const double v35 = v16[0];
    const std::vector<std::vector<double>> v36 = v0.p1;
    v3.p1 = v20;
    std::vector<std::vector<double>> v31 = v36;
    std::vector<std::vector<double>> v30 = v36;
    v4.p1 = v20;
    const std::vector<std::vector<double>> v90 = v3.p1;
    const std::vector<double> v58 = v36[0];
    const std::vector<double> v83 = v30[0];
    v4.p1 = v31;
    const double v108 = v35 + v1;
    v4.p1 = v90;
    v30[0] = v58;
    v3.p1 = v19;
    v31[0] = v83;
    return v108;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
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
