package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.IntersectThreeDuotone: ImageVector
    get() {
        if (_IntersectThreeDuotone != null) {
            return _IntersectThreeDuotone!!
        }
        _IntersectThreeDuotone = ImageVector.Builder(
            name = "Duotone.IntersectThreeDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 108f)
                arcToRelative(60.06f, 60.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -59.36f, -7.28f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 46.56f)
                arcTo(59.94f, 59.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 108f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(104.64f, 147.28f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 204f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.36f, -56.72f)
                arcToRelative(60.17f, 60.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.72f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(187.36f, 100.72f)
                arcTo(60.06f, 60.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 108f)
                arcToRelative(59.94f, 59.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.36f, 39.28f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.36f, 100.72f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 92f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164f, 156f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92f, 156f)
                moveToRelative(-60f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, 120f, 0f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = true, -120f, 0f)
            }
        }.build()

        return _IntersectThreeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectThreeDuotone: ImageVector? = null
