package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PersonSimpleSnowboardDuotone: ImageVector
    get() {
        if (_PersonSimpleSnowboardDuotone != null) {
            return _PersonSimpleSnowboardDuotone!!
        }
        _PersonSimpleSnowboardDuotone = ImageVector.Builder(
            name = "Duotone.PersonSimpleSnowboardDuotone",
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
                moveTo(164f, 52f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(28.44f, 177.67f)
                lineTo(185.88f, 223.3f)
                arcTo(17.25f, 17.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 206.82f)
                horizontalLineToRelative(0f)
                arcToRelative(17.19f, 17.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.44f, -16.49f)
                lineTo(38.12f, 144.7f)
                arcTo(17.25f, 17.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 161.18f)
                horizontalLineToRelative(0f)
                arcTo(17.19f, 17.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.44f, 177.67f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(164f, 52f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(28.44f, 177.67f)
                lineTo(185.88f, 223.3f)
                arcTo(17.25f, 17.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 206.82f)
                horizontalLineToRelative(0f)
                arcToRelative(17.19f, 17.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.44f, -16.49f)
                lineTo(38.12f, 144.7f)
                arcTo(17.25f, 17.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 161.18f)
                horizontalLineToRelative(0f)
                arcTo(17.19f, 17.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.44f, 177.67f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 80f)
                lineTo(216f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.28f, 95.08f)
                lineTo(88.47f, 159.29f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.18f, 120.73f)
                lineToRelative(45.82f, 13.27f)
                lineToRelative(-25.85f, 38.53f)
            }
        }.build()

        return _PersonSimpleSnowboardDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleSnowboardDuotone: ImageVector? = null
