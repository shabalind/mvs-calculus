  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
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
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    let v2: s1 = v0.p1
    let v5: [s0] = v2.p1
    let v16: s0 = v5[0]
    let v22: [[Double]] = v16.p1
    let v18: [Double] = v22[0]
    let v23: s0 = v5[0]
    let v42: [Double] = v22[0]
    let v31: [[Double]] = v23.p1
    let v47: [Double] = v31[0]
    let v28: [[Double]] = [v42, v42, v18, v47, v18, v18, v42]
    let v123: [Double] = v28[5]
    var v60: [Double] = v123
    v60[0] = v1
    let v285: Double = v60[0]
    return v285
  }
  func benchmark() {
    let v0: s4 = s4(p0: s3(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: [s1(p0: [[s0(p0: [[2.0]], p1: [[3.0]])], [s0(p0: [[4.0]], p1: [[5.0]])], [s0(p0: [[6.0]], p1: [[7.0]])]], p1: [s0(p0: [[8.0]], p1: [[9.0]])]), s1(p0: [[s0(p0: [[10.0]], p1: [[11.0]])], [s0(p0: [[12.0]], p1: [[13.0]])], [s0(p0: [[14.0]], p1: [[15.0]])]], p1: [s0(p0: [[16.0]], p1: [[17.0]])])]), p1: s1(p0: [[s0(p0: [[18.0]], p1: [[19.0]])], [s0(p0: [[20.0]], p1: [[21.0]])], [s0(p0: [[22.0]], p1: [[23.0]])]], p1: [s0(p0: [[24.0]], p1: [[25.0]])]))
    let v1: Double = 26.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 26.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
