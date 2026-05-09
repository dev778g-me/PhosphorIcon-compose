package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BathtubDuotone: ImageVector
    get() {
        if (_BathtubDuotone != null) {
            return _BathtubDuotone!!
        }
        _BathtubDuotone = ImageVector.Builder(
            name = "Duotone.BathtubDuotone",
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
                moveTo(200f, 104f)
                verticalLineToRelative(40f)
                horizontalLineTo(136f)
                verticalLineTo(104f)
                horizontalLineTo(16f)
                verticalLineToRelative(40f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                horizontalLineTo(192f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                verticalLineTo(104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 192f)
                lineTo(72f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 192f)
                lineTo(184f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 96f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200f, 104f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
                horizontalLineTo(64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
                verticalLineTo(104f)
                horizontalLineTo(136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 104f)
                verticalLineTo(52f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 32f)
                arcTo(20.44f, 20.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
            }
        }.build()

        return _BathtubDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BathtubDuotone: ImageVector? = null
