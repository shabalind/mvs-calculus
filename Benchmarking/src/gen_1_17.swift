  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: [s0]
    var p1: [s1]
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: s0, _ v2: Double) -> Double {
    let v6: [[Double]] = v1.p1
    let v11: [Double] = v6[0]
    let v27: Double = v11[0]
    var v17: [Double] = v11
    v17[0] = v2
    let v32: Double = v11[0]
    let v33: Double = v27 * v32
    v17[0] = v2
    v17[0] = v32
    let v96: Double = v2 * v33
    let v51: Double = v17[0]
    v17[0] = v32
    let v139: Double = v96 * v51
    return v139
  }
  func benchmark() {
    let v0: s3 = s3(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: [s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])]), s1(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0]]), p1: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])])])
    let v1: s0 = s0(p0: [[24.0], [25.0]], p1: [[26.0]])
    let v2: Double = 27.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 27.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
