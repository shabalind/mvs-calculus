  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: s0
    var p1: [s2]
  }
  func f94(_ v0: Double) -> Double {
    let v7: [Double] = [v0, v0, v0, v0]
    let v2: Double = v7[2]
    var v6: Double = v2
    v6 = v2
    let v5: Double = v7[2]
    var v4: Double = v5
    var v8: Double = v6
    var v11: Double = v8
    var v15: Double = v8
    let v20: Double = v7[2]
    let v23: Double = v7[1]
    var v25: [Double] = v7
    v6 = v15
    v25[3] = v11
    v25[2] = v11
    v25[1] = v15
    let v24: Double = v25[1]
    var v32: [Double] = v7
    v25[0] = v24
    v25[1] = v23
    var v31: [Double] = v7
    var v43: Double = v23
    v31[3] = v43
    var v22: [Double] = v25
    var v38: [Double] = v25
    let v54: [[Double]] = [v22, v25, v31, v31, v25, v32]
    v32[0] = v15
    var v40: [[Double]] = v54
    let v41: Double = v38[1]
    v38[2] = v6
    v40[1] = v31
    let v55: Double = v20 / v41
    let v145: [Double] = v54[1]
    v38[0] = v15
    v38[2] = v4
    v31[1] = v55
    let v139: Double = v145[0]
    v38[1] = v139
    let v99: [Double] = v40[1]
    let v152: Double = v99[3]
    v31[0] = v5
    return v152
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    var v3: Double = v1
    let v5: Double = v3 / v3
    let v2: Double = f94(v5)
    var v4: Double = v2
    let v13: Double = f94(v1)
    let v20: Double = v1 * v2
    var v170: Double = v4
    var v101: Double = v1
    let v65: [Double] = [v13, v5, v170, v20, v101, v4, v4]
    let v157: Double = v65[1]
    return v157
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: [s2(p0: s1(p0: [[s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))])]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
