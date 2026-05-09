package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CloudLightningDuotone: ImageVector
    get() {
        if (_CloudLightningDuotone != null) {
            return _CloudLightningDuotone!!
        }
        _CloudLightningDuotone = ImageVector.Builder(
            name = "Duotone.CloudLightningDuotone",
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
                moveTo(156f, 24f)
                arcTo(68.16f, 68.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.19f, 74.45f)
                verticalLineToRelative(-0.11f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 76f, 160f)
                horizontalLineToRelative(80f)
                arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                horizontalLineTo(76f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 90.2f, 74.34f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(120f, 240f)
                lineToRelative(24f, -40f)
                lineToRelative(-40f, 0f)
                lineToRelative(24f, -40f)
            }
        }.build()

        return _CloudLightningDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CloudLightningDuotone: ImageVector? = null
