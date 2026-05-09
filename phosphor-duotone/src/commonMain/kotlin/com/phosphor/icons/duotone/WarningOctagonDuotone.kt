package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.WarningOctagonDuotone: ImageVector
    get() {
        if (_WarningOctagonDuotone != null) {
            return _WarningOctagonDuotone!!
        }
        _WarningOctagonDuotone = ImageVector.Builder(
            name = "Duotone.WarningOctagonDuotone",
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
                moveTo(164.45f, 32f)
                horizontalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineTo(34.34f, 85.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                lineToRelative(51.55f, 51.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 224f)
                horizontalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, -5.66f)
                verticalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineTo(170.11f, 34.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 136f)
                lineTo(128f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f
            ) {
                moveTo(164.45f, 32f)
                horizontalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.66f, 2.34f)
                lineTo(34.34f, 85.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.66f)
                lineToRelative(51.55f, 51.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.55f, 224f)
                horizontalLineToRelative(72.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, -2.34f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, -5.66f)
                verticalLineTo(91.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineTo(170.11f, 34.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 164.45f, 32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 172f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _WarningOctagonDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WarningOctagonDuotone: ImageVector? = null
