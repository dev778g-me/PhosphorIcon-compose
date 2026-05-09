package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.NewspaperClippingDuotone: ImageVector
    get() {
        if (_NewspaperClippingDuotone != null) {
            return _NewspaperClippingDuotone!!
        }
        _NewspaperClippingDuotone = ImageVector.Builder(
            name = "Duotone.NewspaperClippingDuotone",
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
                moveTo(216f, 48f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(216f)
                lineToRelative(32f, -16f)
                lineToRelative(32f, 16f)
                lineToRelative(32f, -16f)
                lineToRelative(32f, 16f)
                lineToRelative(32f, -16f)
                lineToRelative(32f, 16f)
                verticalLineTo(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(112f, 160f)
                horizontalLineTo(64f)
                verticalLineTo(96f)
                horizontalLineToRelative(48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 216f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(216f)
                lineToRelative(-32f, -16f)
                lineToRelative(-32f, 16f)
                lineToRelative(-32f, -16f)
                lineTo(96f, 216f)
                lineTo(64f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 112f)
                lineTo(192f, 112f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 144f)
                lineTo(192f, 144f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 96f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-48f)
                close()
            }
        }.build()

        return _NewspaperClippingDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NewspaperClippingDuotone: ImageVector? = null
