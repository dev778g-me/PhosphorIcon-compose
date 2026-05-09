package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.LecternDuotone: ImageVector
    get() {
        if (_LecternDuotone != null) {
            return _LecternDuotone!!
        }
        _LecternDuotone = ImageVector.Builder(
            name = "Duotone.LecternDuotone",
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
                moveTo(24f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -11.58f)
                lineToRelative(40f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 4.42f)
                lineToRelative(40f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, -11.58f)
                lineToRelative(40f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.16f, 4.42f)
                lineToRelative(40f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 104f)
                lineTo(184f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                lineTo(128f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 216f)
                lineTo(160f, 216f)
            }
        }.build()

        return _LecternDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LecternDuotone: ImageVector? = null
