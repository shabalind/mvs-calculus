  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  struct s3 {
    var p0: s2
    var p1: [s0]
  }
  func f14(_ v0: s0, _ v1: s0) -> s0 {
    var v4: s0 = v0
    let v7: s1 = s1(p0: v1, p1: v4)
    let v8: [[Double]] = v0.p0
    let v5: [[[Double]]] = [v8, v8, v8, v8, v8, v8]
    let v12: s0 = v7.p1
    var v16: [[[Double]]] = v5
    let v10: [[Double]] = v16[1]
    v16[1] = v8
    let v17: [[Double]] = v5[2]
    v4.p0 = v10
    let v34: [Double] = v17[1]
    let v24: [[Double]] = [v34]
    var v21: [[Double]] = v24
    let v87: [[Double]] = v16[5]
    var v35: [[Double]] = v24
    let v60: s0 = s0(p0: v87, p1: v35)
    let v69: [[Double]] = v12.p1
    var v47: s0 = v60
    v47.p1 = v69
    v4.p1 = v21
    return v47
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: Double) -> Double {
    let v7: [s0] = v0.p1
    let v5: s0 = v7[0]
    let v3: s0 = f14(v5, v5)
    let v8: [[Double]] = v3.p0
    let v10: [Double] = v8[1]
    let v141: Double = v10[0]
    return v141
  }
  func benchmark() {
    let v0: s3 = s3(p0: s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))], p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]])), p1: [s0(p0: [[21.0], [22.0]], p1: [[23.0]])])
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
