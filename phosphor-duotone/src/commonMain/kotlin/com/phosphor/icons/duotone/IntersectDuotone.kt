package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.IntersectDuotone: ImageVector
    get() {
        if (_IntersectDuotone != null) {
            return _IntersectDuotone!!
        }
        _IntersectDuotone = ImageVector.Builder(
            name = "Duotone.IntersectDuotone",
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
                moveTo(88f, 160f)
                arcToRelative(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.4f, 7.6f)
                arcToRelative(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 0.4f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72f)
                arcToRelative(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, -7.6f)
                arcTo(73.37f, 73.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 88f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 160f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 96f)
                moveToRelative(-72f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 144f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -144f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 160f)
                moveToRelative(-72f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 144f, 0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -144f, 0f)
            }
        }.build()

        return _IntersectDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectDuotone: ImageVector? = null
