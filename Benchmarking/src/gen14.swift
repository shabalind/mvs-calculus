  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [[s0]]
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: [s1]
  }
  struct s4 {
    var p0: s3
    var p1: [[Double]]
  }
  func f28(_ v0: Double) -> Double {
    var v4: Double = v0
    var v2: Double = v0
    var v13: Double = v0
    var v7: Double = v4
    var v1: Double = v7
    var v3: Double = v7
    var v5: Double = v3
    let v9: [Double] = [v7, v4, v13, v5, v5, v13, v13]
    v4 = v3
    var v6: [Double] = v9
    var v19: [Double] = v6
    var v26: Double = v0
    var v21: [Double] = v9
    var v14: [Double] = v6
    var v17: Double = v0
    var v22: [Double] = v19
    let v33: Double = v22[6]
    var v25: [Double] = v9
    v19[4] = v26
    let v16: Double = v9[0]
    var v37: Double = v0
    v21[4] = v37
    v14[6] = v17
    v19[0] = v16
    v14[1] = v1
    var v36: [Double] = v14
    let v34: Double = v9[1]
    let v24: Double = v36[3]
    let v30: Double = v25[1]
    var v27: [Double] = v19
    var v46: [Double] = v22
    var v47: [Double] = v36
    var v50: Double = v2
    v21[2] = v33
    var v42: Double = v37
    v22[6] = v0
    v37 = v30
    var v68: [Double] = v27
    v27 = v21
    let v48: [[Double]] = [v68, v21, v47, v9, v36, v46]
    v27[0] = v50
    v42 = v24
    let v35: [Double] = v48[3]
    var v69: [[Double]] = v48
    let v73: [Double] = v48[5]
    v5 = v42
    let v91: Double = v73[1]
    v22 = v35
    let v110: [Double] = v69[3]
    let v120: Double = v110[4]
    v27[6] = v34
    v13 = v91
    return v120
  }
  @inline(never)
  func f0(_ v0: [[s4]], _ v1: Double) -> Double {
    var v5: Double = v1
    let v4: Double = f28(v1)
    var v2: Double = v4
    let v17: Double = v2 * v5
    let v43: Double = v17 + v17
    let v32: [Double] = [v43]
    let v49: Double = f28(v2)
    let v48: Double = v32[0]
    let v79: Double = v49 / v48
    return v79
  }
  func benchmark() {
    let v0: [[s4]] = [[s4(p0: s3(p0: s0(p0: [[0.0]], p1: 1.0), p1: [s1(p0: [[s0(p0: [[2.0]], p1: 3.0)], [s0(p0: [[4.0]], p1: 5.0)], [s0(p0: [[6.0]], p1: 7.0)]], p1: [s0(p0: [[8.0]], p1: 9.0)]), s1(p0: [[s0(p0: [[10.0]], p1: 11.0)], [s0(p0: [[12.0]], p1: 13.0)], [s0(p0: [[14.0]], p1: 15.0)]], p1: [s0(p0: [[16.0]], p1: 17.0)])]), p1: [[18.0], [19.0], [20.0]])], [s4(p0: s3(p0: s0(p0: [[21.0]], p1: 22.0), p1: [s1(p0: [[s0(p0: [[23.0]], p1: 24.0)], [s0(p0: [[25.0]], p1: 26.0)], [s0(p0: [[27.0]], p1: 28.0)]], p1: [s0(p0: [[29.0]], p1: 30.0)]), s1(p0: [[s0(p0: [[31.0]], p1: 32.0)], [s0(p0: [[33.0]], p1: 34.0)], [s0(p0: [[35.0]], p1: 36.0)]], p1: [s0(p0: [[37.0]], p1: 38.0)])]), p1: [[39.0], [40.0], [41.0]])]]
    let v1: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
