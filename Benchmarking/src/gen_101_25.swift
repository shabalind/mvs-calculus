  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  struct s12 {
    var p0: s3
    var p1: [[s3]]
  }
  @inline(never)
  func f0(_ v0: s12, _ v1: Double) -> Double {
    var v6: Double = v1
    let v15: Double = v1 + v1
    let v16: [[s3]] = v0.p1
    let v38: [s3] = v16[0]
    let v28: s3 = v38[0]
    v6 = v15
    let v37: s0 = v28.p0
    let v84: [[Double]] = v37.p0
    let v75: [Double] = v84[0]
    let v117: Double = v75[0]
    let v137: Double = v6 - v117
    return v137
  }
  func benchmark() {
    let v0: s12 = s12(p0: s3(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), p1: [[s3(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))], [s3(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))], [s3(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0]], p1: [[23.0]]))]])
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
