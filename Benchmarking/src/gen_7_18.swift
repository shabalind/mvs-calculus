  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s3
    var p1: [[Double]]
  }
  func f8(_ v0: Double) -> Double {
    var v5: Double = v0
    v5 = v0
    let v4: Double = v0 / v5
    var v3: Double = v4
    var v7: Double = v3
    var v23: Double = v4
    var v2: Double = v23
    var v6: Double = v4
    var v10: Double = v4
    var v11: Double = v3
    var v16: Double = v23
    var v18: Double = v10
    let v13: Double = v2 * v6
    var v17: Double = v13
    v17 = v16
    var v21: Double = v11
    var v37: Double = v4
    let v39: Double = v3 + v6
    var v31: Double = v7
    v6 = v21
    var v45: Double = v39
    var v32: Double = v5
    var v60: Double = v0
    v11 = v3
    var v65: Double = v16
    let v58: [Double] = [v2, v60, v65]
    var v26: [Double] = v58
    v26[0] = v3
    v26[2] = v31
    v26[2] = v32
    v26[1] = v45
    v26[2] = v37
    v26[1] = v18
    var v51: [Double] = v26
    v26[2] = v17
    v26[1] = v17
    v26[1] = v17
    let v81: Double = v51[0]
    v26[2] = v17
    return v81
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    var v5: Double = v1
    let v4: Double = f8(v1)
    let v3: Double = f8(v4)
    let v37: Double = f8(v3)
    let v45: Double = v5 - v37
    return v45
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: s3(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s0(p0: [[2.0]], p1: [[3.0]])), p1: [[4.0], [5.0], [6.0]]), s5(p0: s3(p0: s0(p0: [[7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0]])), p1: [[11.0], [12.0], [13.0]])]
    let v1: Double = 14.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 14.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
