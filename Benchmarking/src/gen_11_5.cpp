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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f18(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p0;
    const std::vector<double> v6 = v1[2];
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v8 = v0.p1;
    s0 v4 = v0;
    const std::vector<std::vector<double>> v13 = v4.p1;
    const std::vector<std::vector<double>> v5 = v0.p1;
    const std::vector<std::vector<double>> v10 = v4.p0;
    std::vector<std::vector<double>> v9 = v10;
    std::vector<std::vector<double>> v18 = v1;
    const std::vector<std::vector<double>> v12 = v0.p1;
    const std::vector<double> v28 = v8[2];
    const std::vector<std::vector<double>> v16 = v4.p1;
    const std::vector<s0> v34 { v0, v0, v4 };
    const std::vector<std::vector<std::vector<double>>> v35 { v1, v16, v9, v16, v13, v5, v7 };
    v4.p0 = v8;
    std::vector<std::vector<std::vector<double>>> v21 = v35;
    v4.p1 = v7;
    const std::vector<double> v26 = v5[0];
    v18[1] = v6;
    const s0 v17 = v34[1];
    std::vector<std::vector<double>> v30 = v13;
    const std::vector<std::vector<double>> v20 = v21[4];
    const std::vector<std::vector<double>> v25 = v35[1];
    v4.p0 = v8;
    const s0 v23(v9, v12);
    v4.p0 = v30;
    const std::vector<double> v48 = v7[0];
    v4.p1 = v25;
    const std::vector<std::vector<double>> v39 = v4.p1;
    const std::vector<std::vector<double>> v29 = v0.p0;
    std::vector<std::vector<double>> v32 = v29;
    const s0 v94(v25, v30);
    v9[0] = v26;
    std::vector<std::vector<double>> v54 = v39;
    s0 v114 = v0;
    v114.p1 = v30;
    const std::vector<s0> v103 { v4, v94, v114, v4 };
    const std::vector<std::vector<double>> v140 = v23.p1;
    v21[1] = v140;
    const s0 v91 = v103[3];
    v114.p1 = v9;
    const std::vector<std::vector<double>> v47 = v35[2];
    v30 = v54;
    v114.p1 = v32;
    const std::vector<std::vector<double>> v100 = v17.p0;
    std::vector<double> v176 = v28;
    v4.p0 = v20;
    const std::vector<std::vector<double>> v76 = v91.p0;
    v114.p1 = v10;
    const s0 v93(v100, v140);
    v4.p0 = v47;
    const std::vector<std::vector<double>> v195 = v93.p1;
    v114.p1 = v18;
    v4.p1 = v39;
    v4.p1 = v195;
    std::vector<s0> v188 = v103;
    v18[1] = v176;
    v30[1] = v48;
    v18[1] = v28;
    v114.p0 = v76;
    const s0 v235 = v188[1];
    v114.p1 = v1;
    return v235;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const std::vector<std::vector<s2>> &v1, const double &v2) {
    const std::vector<s2> v3 = v1[0];
    const s2 v7 = v3[0];
    const s1 v10 = v7.p1;
    const std::vector<std::vector<s0>> v5 = v10.p1;
    const std::vector<s0> v12 = v5[0];
    const s0 v16 = v12[0];
    const s0 v41 = f18(v16);
    const std::vector<std::vector<double>> v96 = v41.p0;
    const std::vector<double> v71 = v96[0];
    const double v155 = v71[0];
    return v155;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } }, { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } }, { { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } }, { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { 102.0 }, { 103.0 }, { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } }, { { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 }, { 113.0 } } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } }, { { { { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 }, { 124.0 }, { 125.0 } } }, { { { 126.0 }, { 127.0 }, { 128.0 } }, { { 129.0 }, { 130.0 }, { 131.0 } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 }, { 136.0 }, { 137.0 } } } }, { { { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 }, { 143.0 } } } }, { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } } } }, { { { { { 150.0 }, { 151.0 }, { 152.0 } }, { { 153.0 }, { 154.0 }, { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 }, { 160.0 }, { 161.0 } } }, { { { 162.0 }, { 163.0 }, { 164.0 } }, { { 165.0 }, { 166.0 }, { 167.0 } } } }, { { { { { 168.0 }, { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 }, { 173.0 } } } }, { { { { 174.0 }, { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } } } } } });
    std::vector<std::vector<s2>> v1({ { { { { { { { 180.0 }, { 181.0 }, { 182.0 } }, { { 183.0 }, { 184.0 }, { 185.0 } } }, { { { 186.0 }, { 187.0 }, { 188.0 } }, { { 189.0 }, { 190.0 }, { 191.0 } } }, { { { 192.0 }, { 193.0 }, { 194.0 } }, { { 195.0 }, { 196.0 }, { 197.0 } } } }, { { { { { 198.0 }, { 199.0 }, { 200.0 } }, { { 201.0 }, { 202.0 }, { 203.0 } } } }, { { { { 204.0 }, { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 }, { 209.0 } } } } } }, { { { { { 210.0 }, { 211.0 }, { 212.0 } }, { { 213.0 }, { 214.0 }, { 215.0 } } }, { { { 216.0 }, { 217.0 }, { 218.0 } }, { { 219.0 }, { 220.0 }, { 221.0 } } }, { { { 222.0 }, { 223.0 }, { 224.0 } }, { { 225.0 }, { 226.0 }, { 227.0 } } } }, { { { { { 228.0 }, { 229.0 }, { 230.0 } }, { { 231.0 }, { 232.0 }, { 233.0 } } } }, { { { { 234.0 }, { 235.0 }, { 236.0 } }, { { 237.0 }, { 238.0 }, { 239.0 } } } } } } } } });
    double v2(240.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
