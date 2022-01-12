  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  struct s3 {
    var p0: s0
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: [s3], _ v1: Double) -> Double {
    let v6: s3 = v0[1]
    let v5: s2 = v6.p1
    var v19: Double = v1
    v19 = v1
    let v35: [s0] = v5.p1
    let v57: s0 = v35[1]
    let v37: [[Double]] = v57.p0
    let v46: [Double] = v37[0]
    var v49: [Double] = v46
    let v109: [[Double]] = [v49]
    let v87: [Double] = v109[0]
    v49[0] = v19
    let v117: Double = v87[0]
    return v117
  }
  func benchmark() {
    let v0: [s3] = [s3(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s2(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]]), p1: [s0(p0: [[6.0]], p1: [[7.0], [8.0]]), s0(p0: [[9.0]], p1: [[10.0], [11.0]])])), s3(p0: s0(p0: [[12.0]], p1: [[13.0], [14.0]]), p1: s2(p0: s0(p0: [[15.0]], p1: [[16.0], [17.0]]), p1: [s0(p0: [[18.0]], p1: [[19.0], [20.0]]), s0(p0: [[21.0]], p1: [[22.0], [23.0]])])), s3(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0]]), p1: s2(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0]]), p1: [s0(p0: [[30.0]], p1: [[31.0], [32.0]]), s0(p0: [[33.0]], p1: [[34.0], [35.0]])]))]
    let v1: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
