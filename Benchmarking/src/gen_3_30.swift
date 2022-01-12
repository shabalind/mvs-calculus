  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: Double
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s8 {
    var p0: s2
    var p1: s3
  }
  @inline(never)
  func f0(_ v0: [s8], _ v1: [s1], _ v2: Double) -> Double {
    let v8: s8 = v0[0]
    let v6: s3 = v8.p1
    let v7: s1 = v1[0]
    let v10: [s1] = [v7, v7, v7, v7, v7]
    let v24: [s1] = v6.p1
    let v85: s1 = v24[0]
    let v46: s1 = v10[1]
    let v57: Double = v46.p1
    let v44: Double = v57 / v57
    let v99: Double = v85.p1
    let v151: Double = v99 - v2
    let v141: Double = v151 + v44
    return v141
  }
  func benchmark() {
    let v0: [s8] = [s8(p0: s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: 4.0), p1: s1(p0: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0]]), p1: 9.0)), p1: s3(p0: [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0]]), s0(p0: [[14.0], [15.0]], p1: [[16.0], [17.0]])], p1: [s1(p0: s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0]]), p1: 22.0), s1(p0: s0(p0: [[23.0], [24.0]], p1: [[25.0], [26.0]]), p1: 27.0)])), s8(p0: s2(p0: s1(p0: s0(p0: [[28.0], [29.0]], p1: [[30.0], [31.0]]), p1: 32.0), p1: s1(p0: s0(p0: [[33.0], [34.0]], p1: [[35.0], [36.0]]), p1: 37.0)), p1: s3(p0: [s0(p0: [[38.0], [39.0]], p1: [[40.0], [41.0]]), s0(p0: [[42.0], [43.0]], p1: [[44.0], [45.0]])], p1: [s1(p0: s0(p0: [[46.0], [47.0]], p1: [[48.0], [49.0]]), p1: 50.0), s1(p0: s0(p0: [[51.0], [52.0]], p1: [[53.0], [54.0]]), p1: 55.0)]))]
    let v1: [s1] = [s1(p0: s0(p0: [[56.0], [57.0]], p1: [[58.0], [59.0]]), p1: 60.0)]
    let v2: Double = 61.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 61.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
