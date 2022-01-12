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
    var p0: s1
    var p1: s0
  }
  struct s3 {
    var p0: [[s2]]
    var p1: s1
  }
  struct s9 {
    var p0: s3
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: [s1], _ v2: [s0], _ v3: Double) -> Double {
    let v8: s3 = v0.p0
    let v7: [[s2]] = v8.p0
    let v4: [s2] = v7[0]
    var v13: [s2] = v4
    let v16: [[s2]] = v8.p0
    let v26: [s2] = v16[1]
    let v31: s2 = v13[0]
    let v25: s0 = v31.p1
    v13 = v26
    let v50: [[Double]] = v25.p0
    let v83: [Double] = v50[0]
    let v73: Double = v83[0]
    let v108: Double = v73 / v73
    return v108
  }
  func benchmark() {
    let v0: s9 = s9(p0: s3(p0: [[s2(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]])), p1: s0(p0: [[6.0]], p1: [[7.0], [8.0]]))], [s2(p0: s1(p0: s0(p0: [[9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0]])), p1: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))], [s2(p0: s1(p0: s0(p0: [[18.0]], p1: [[19.0], [20.0]]), p1: s0(p0: [[21.0]], p1: [[22.0], [23.0]])), p1: s0(p0: [[24.0]], p1: [[25.0], [26.0]]))]], p1: s1(p0: s0(p0: [[27.0]], p1: [[28.0], [29.0]]), p1: s0(p0: [[30.0]], p1: [[31.0], [32.0]]))), p1: s0(p0: [[33.0]], p1: [[34.0], [35.0]]))
    let v1: [s1] = [s1(p0: s0(p0: [[36.0]], p1: [[37.0], [38.0]]), p1: s0(p0: [[39.0]], p1: [[40.0], [41.0]])), s1(p0: s0(p0: [[42.0]], p1: [[43.0], [44.0]]), p1: s0(p0: [[45.0]], p1: [[46.0], [47.0]])), s1(p0: s0(p0: [[48.0]], p1: [[49.0], [50.0]]), p1: s0(p0: [[51.0]], p1: [[52.0], [53.0]]))]
    let v2: [s0] = [s0(p0: [[54.0]], p1: [[55.0], [56.0]]), s0(p0: [[57.0]], p1: [[58.0], [59.0]])]
    let v3: Double = 60.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 60.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
