package com.phosphor.icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Light.CommandLight: ImageVector
    get() {
        if (_CommandLight != null) {
            return _CommandLight!!
        }
        _CommandLight = ImageVector.Builder(
            name = "Light.CommandLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 48f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 28f)
                verticalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, 28f)
                horizontalLineTo(152f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                verticalLineTo(76f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -28f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 104f)
                lineTo(76f, 104f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
                lineToRelative(-0f, -0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -28f)
                lineToRelative(-0f, -0f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 76f)
                lineTo(104f, 104f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 104f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 152f)
                horizontalLineToRelative(28f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 28f)
                verticalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, 28f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
                verticalLineTo(152f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 152f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(76f, 208f)
                lineToRelative(-0f, -0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
                lineToRelative(-0f, -0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, -28f)
                lineTo(104f, 152f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(104f, 180f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 208f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 104f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-48f)
                close()
            }
        }.build()

        return _CommandLight!!
    }

@Suppress("ObjectPropertyName")
private var _CommandLight: ImageVector? = null
