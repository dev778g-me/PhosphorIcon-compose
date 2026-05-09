package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PersonSimpleSnowboardBold: ImageVector
    get() {
        if (_PersonSimpleSnowboardBold != null) {
            return _PersonSimpleSnowboardBold!!
        }
        _PersonSimpleSnowboardBold = ImageVector.Builder(
            name = "Bold.PersonSimpleSnowboardBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(29.82f, 182f)
                lineToRelative(153.6f, 45.21f)
                arcTo(19.23f, 19.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 208.61f)
                horizontalLineToRelative(0f)
                arcTo(19.37f, 19.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.18f, 190f)
                lineTo(40.58f, 144.79f)
                arcTo(19.23f, 19.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 163.39f)
                horizontalLineToRelative(0f)
                arcTo(19.37f, 19.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.82f, 182f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 48f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 80f)
                lineTo(216f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.71f, 127.43f)
                lineToRelative(50.29f, 14.57f)
                lineToRelative(-21.26f, 31.69f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.28f, 95.08f)
                lineTo(88.7f, 158.95f)
            }
        }.build()

        return _PersonSimpleSnowboardBold!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSnowboardBold: ImageVector? = null
