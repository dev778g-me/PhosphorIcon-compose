package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PhoneSlashDuotone: ImageVector
    get() {
        if (_PhoneSlashDuotone != null) {
            return _PhoneSlashDuotone!!
        }
        _PhoneSlashDuotone = ImageVector.Builder(
            name = "Duotone.PhoneSlashDuotone",
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
                moveTo(225.94f, 111.83f)
                curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.26f, 2.47f)
                lineTo(171.58f, 158f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.86f, -5.8f)
                lineToRelative(-6.21f, -29.74f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.14f, -5.9f)
                arcToRelative(84.39f, 84.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -55.1f, 0.13f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 6f)
                lineToRelative(-5.9f, 29.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.38f, 158f)
                lineTo(35.29f, 175.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 173f)
                curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4f, -61.12f)
                curveTo(83.17f, 58.72f, 172.83f, 58.72f, 225.94f, 111.83f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120.51f, 72.19f)
                curveToRelative(38.15f, -2f, 77f, 11.23f, 105.43f, 39.64f)
                curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.26f, 2.47f)
                lineToRelative(-9.37f, -3.32f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.45f, 113.09f)
                arcToRelative(83.51f, 83.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.18f, 3.6f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.12f, 6f)
                lineToRelative(-5.9f, 29.51f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84.38f, 158f)
                lineTo(35.29f, 175.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 173f)
                curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4f, -61.12f)
                arcTo(135.14f, 135.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.53f, 79.08f)
            }
        }.build()

        return _PhoneSlashDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSlashDuotone: ImageVector? = null
