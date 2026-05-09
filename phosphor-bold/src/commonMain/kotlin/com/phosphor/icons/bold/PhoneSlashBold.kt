package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PhoneSlashBold: ImageVector
    get() {
        if (_PhoneSlashBold != null) {
            return _PhoneSlashBold!!
        }
        _PhoneSlashBold = ImageVector.Builder(
            name = "Bold.PhoneSlashBold",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
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
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.18f, 72f)
                curveToRelative(34.63f, 0.76f, 69f, 14f, 94.76f, 39.79f)
                curveToRelative(17.29f, 17.29f, 18.63f, 42.29f, 4f, 61.12f)
                arcToRelative(7.87f, 7.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.46f, 2.84f)
            }
        }.build()

        return _PhoneSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneSlashBold: ImageVector? = null
