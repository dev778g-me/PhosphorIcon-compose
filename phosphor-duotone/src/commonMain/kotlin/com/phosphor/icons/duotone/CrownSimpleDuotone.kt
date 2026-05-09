package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CrownSimpleDuotone: ImageVector
    get() {
        if (_CrownSimpleDuotone != null) {
            return _CrownSimpleDuotone!!
        }
        _CrownSimpleDuotone = ImageVector.Builder(
            name = "Duotone.CrownSimpleDuotone",
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
                moveTo(54.71f, 200f)
                horizontalLineTo(201.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.88f, -6.61f)
                lineToRelative(22.7f, -104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218f, 82.76f)
                lineTo(176f, 128f)
                lineTo(135.26f, 36.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.52f, 0f)
                lineTo(80f, 128f)
                lineTo(38f, 82.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.9f, 6.66f)
                lineToRelative(22.7f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.71f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(54.71f, 200f)
                horizontalLineTo(201.29f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.88f, -6.61f)
                lineToRelative(22.7f, -104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218f, 82.76f)
                lineTo(176f, 128f)
                lineTo(135.26f, 36.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.52f, 0f)
                lineTo(80f, 128f)
                lineTo(38f, 82.76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.9f, 6.66f)
                lineToRelative(22.7f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 54.71f, 200f)
                close()
            }
        }.build()

        return _CrownSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CrownSimpleDuotone: ImageVector? = null
